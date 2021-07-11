package com.test.testweb.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/17 8:15 下午
 */
@Configuration
public class FaviconConfiguration {

    @Bean
    public SimpleUrlHandlerMapping customFaviconHandlerMapping() {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setOrder(Integer.MIN_VALUE);
        mapping.setUrlMap(Collections.singletonMap(
                "/favicon.ico", faviconRequestHandler()));
        return mapping;
    }


        @Bean
        protected ResourceHttpRequestHandler faviconRequestHandler() {
            ResourceHttpRequestHandler requestHandler
                    = new ResourceHttpRequestHandler();
            ClassPathResource classPathResource
                    = new ClassPathResource("src/main/resources/static/");
            List<Resource> locations = Arrays.asList(classPathResource);
            requestHandler.setLocations(locations);
            return requestHandler;
        }
    }

