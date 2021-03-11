package com.test.testweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Scheme {
    private int schemeId;
    private String schemeName;
    private String schemeDesc;

}
