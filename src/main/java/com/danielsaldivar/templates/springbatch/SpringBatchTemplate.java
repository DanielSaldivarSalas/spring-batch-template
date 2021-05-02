package com.danielsaldivar.templates.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchTemplate {
    public static void main(String[] args) {
        SpringApplication.run(SpringBatchTemplate.class, args);

    }
}
