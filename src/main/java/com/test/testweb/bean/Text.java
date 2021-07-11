package com.test.testweb.bean;


import lombok.*;
import org.springframework.context.annotation.Bean;


@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Text {
    private String text;



    public static void main(String[] args) {
        String tet="123456";
        if (tet instanceof String){
            System.out.println("true");
        }
    }
}
