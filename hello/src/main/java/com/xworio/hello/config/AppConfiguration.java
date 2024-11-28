package com.xworio.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworio.hello")
@Configuration
public class AppConfiguration {

    public AppConfiguration()
    {
        System.out.println("confugiration set");
    }
    @Bean
    public String teamName()
    {
        String str = new String("Spartans");
        return str;
    }
    @Bean
    public double budget()
    {
        return 100000;
    }
    @Bean
    public String ownerName()
    {
        String name = new String("Saqib");
        return name;
    }

    @Bean
    public double batCost()
    {
        return 5000;
    }

    @Bean
    public double ballCost()
    {
        return 250;
    }


}
