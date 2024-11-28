package com.xworkz.propertyannotation.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:app.properties")
public class Hills {

    @Value("${dbusername}")
    private String dbusername;
    @Value("${dbpassword}")
    private String dbpassword;
    @Autowired
    @Qualifier("greeting")
    private String greet;

    public Hills() {
        System.out.println("Hills COnstructor");
    }

    @PostConstruct
    public void initProps() {
        System.out.println(this.dbusername);
        System.out.println(this.dbpassword);
    }
}
