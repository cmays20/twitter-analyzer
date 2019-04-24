package com.example.twitteranalyzer;

import com.example.twitteranalyzer.service.SparkConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterAnalyzerApplication implements CommandLineRunner {

    @Autowired
    private SparkConsumerService sparkConsumerService;

    public static void main(String[] args) {
        SpringApplication.run(TwitterAnalyzerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sparkConsumerService.run();
    }
}
