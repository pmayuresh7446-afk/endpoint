package com.example.endpoint.endpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EndpointsApplication
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {

        return application.sources(EndpointsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EndpointsApplication.class, args);
    }
}