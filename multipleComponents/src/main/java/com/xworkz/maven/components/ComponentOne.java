package com.xworkz.maven.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;


public class ComponentOne {
    public ComponentOne()
    {
        System.out.println("component one intialized");
    }
}
