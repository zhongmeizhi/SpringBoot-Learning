package com.example.javademo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {

    @Value("${com.demo.author}")
    private String author;

    public String getAuthor(){
        return author;
    }
}
