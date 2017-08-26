package com.douglas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.logging.Logger;

@SpringBootApplication
public class TccApplication extends SpringBootServletInitializer {

    private static Logger logger = Logger.getLogger(TccApplication.class.getName());

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TccApplication.class, args);
    }
}
