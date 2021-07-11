package com.test.testweb.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import springfox.documentation.oas.web.OpenApiTransformationContext;
import springfox.documentation.oas.web.WebMvcOpenApiTransformationFilter;
import springfox.documentation.spi.DocumentationType;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/20 6:55 上午
 */
@Component
public class SpringFoxSwaggerHostResolver implements WebMvcOpenApiTransformationFilter {

    @Override
    public OpenAPI transform(OpenApiTransformationContext<HttpServletRequest> context) {
            HttpServletRequest request = context.request().get();
            OpenAPI swagger = context.getSpecification();
            String scheme = "http";

            String referer = request.getHeader("Referer");

            if (StringUtils.hasLength(referer)) {
//获取协议

                scheme = referer.split(":")[0];

            }

            List servers = new ArrayList<>();

            String finalScheme = scheme;

//重新组装server信息

            swagger.getServers().forEach(item -> {
//替换协议,去掉默认端口

                item.setUrl(clearDefaultPort(item.getUrl().replace("http", finalScheme)));

//                servers.add(item);

            });

            swagger.setServers(servers);

            return swagger;

        }

    private String clearDefaultPort(String url){
        String port = url.split(":")[2];
        if("80".equals(port)||"443".equals(port)){
            return url.replace(":80","").replace(":443","");
        }
        return url;
    }

    @Override
    public boolean supports(DocumentationType documentationType) {
        return documentationType.equals(DocumentationType.OAS_30);

    }
}
