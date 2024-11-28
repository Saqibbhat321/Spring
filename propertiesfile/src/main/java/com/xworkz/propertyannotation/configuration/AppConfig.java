package com.xworkz.propertyannotation.configuration;


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
        System.out.println("salam Habibi");
        return " greatings";
    }

    @Bean
    public String famousCity() {
        System.out.println("Kulgam");
        return "city";
    }


}
