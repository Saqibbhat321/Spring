package com.xworkz.song.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.song")
@Configuration

public class ApplicationConfiguration {

    public ApplicationConfiguration()
    {
        System.out.println("ApplicationConfiguration Created");
    }

}
