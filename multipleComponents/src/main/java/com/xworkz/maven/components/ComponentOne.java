package com.xworkz.maven.components;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component

public class ComponentOne implements Configuration {

    public ComponentOne()
    {
        System.out.println("Application  initialized");
    }

    @Override
    public String value() {
        return "";
    }

    @Override
    public boolean proxyBeanMethods() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
