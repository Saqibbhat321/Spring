package com.xworkz.maven.components;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.lang.annotation.Annotation;
@Component
public class ComponentTwo implements Configuration {

    public ComponentTwo()
    {
        System.out.println("Second component initialized ");
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
