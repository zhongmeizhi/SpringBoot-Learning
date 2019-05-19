package com.example.javademo;

import com.example.javademo.config.MyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaDemoApplication.class, args);

        MyProperties myProperties = new MyProperties();
        String author = myProperties.getAuthor();

        System.out.println(author);
    }

}
