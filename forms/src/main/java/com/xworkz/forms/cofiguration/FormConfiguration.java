package com.xworkz.forms.cofiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.forms")
public class FormConfiguration {

    public FormConfiguration()
    {
        System.out.println("Configuring");
    }


}
