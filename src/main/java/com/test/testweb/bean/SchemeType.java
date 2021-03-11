package com.test.testweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "schemetype")
public class SchemeType {
    private int typeId;
    private String typeName;
    private Scheme scheme;
}
