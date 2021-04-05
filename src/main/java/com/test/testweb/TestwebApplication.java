package com.test.testweb;

import com.test.testweb.bean.Note;
import com.test.testweb.bean.Records;
//import lombok.extern.slf4j.XSlf4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;

@Slf4j
@EnableCaching
@SpringBootConfiguration
@ComponentScan("com.test.testweb")
@EnableAutoConfiguration
public class TestwebApplication {



    @Autowired
    Records records;

    public static void main(String[] args) {
        log.info("项目正常启动");
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
