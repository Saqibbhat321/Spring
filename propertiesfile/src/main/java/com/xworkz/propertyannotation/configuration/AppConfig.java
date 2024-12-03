package com.xworkz.propertyannotation.configuration;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.xworkz.propertyannotation")
@Configuration
public class AppConfig {


    public AppConfig() {
        System.out.println("App Configuration");
    }

    @Bean
    public String greeting() {
        System.out.println("Salaam Habibi");
        return " greatings";
    }

    @Bean
    public String famousCity() {
        System.out.println("Kulgam");
        return "city";
    }
    @Bean
    @Qualifier("add")
    public int Add()
    {
        System.out.println("add kar note");
        return 1;
    }


}
