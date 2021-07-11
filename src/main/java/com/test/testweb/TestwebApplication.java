package com.test.testweb;

import com.test.testweb.bean.Records;
//import lombok.extern.slf4j.XSlf4j;
import com.test.testweb.mapper.AccountMapper;
import com.test.testweb.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@Slf4j
@EnableCaching
@SpringBootConfiguration
@ComponentScan("com.test.testweb")
@EnableAutoConfiguration
@EnableOpenApi
@MapperScan("com.test.testweb.mapper")
public class TestwebApplication {


    @Autowired
    Records records;

    @Autowired
    private AccountMapper mapper;






    public static void main(String[] args) {
        log.info("项目启动");

        SpringApplication.run(TestwebApplication.class,args);



/*       ConfigurableApplicationContext run=  SpringApplication.run(TestwebApplication.class, args);

        Records record=run.getBean("record",Records.class);
        Note note=run.getBean("note", Note.class);
        System.out.println(record);
        System.out.println(note);
        System.out.println(record ==note.getRecords());
        System.out.println(note.getRecords()+" : "+record);

         //Object bean=run.getBean("record",Records.class);
        for (String n:        run.getBeanDefinitionNames()
             ) {
            System.out.println(n);
        }*/



         //System.out.println(bean);
        //判定容器中是否有record组件
/*        Boolean new2=run.containsBean("record");
        System.out.println(run.containsBean("list"));
        System.out.println(new2);*/

         //判定容器中是否有record组件
    }

}
