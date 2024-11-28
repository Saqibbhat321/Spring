package com.xworio.hello.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stadium {
    @Autowired
    private String teamName;

    public Stadium()
    {
        System.out.println("Stadium component called");
    }
}
