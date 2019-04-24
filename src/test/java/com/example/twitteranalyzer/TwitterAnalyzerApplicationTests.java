package com.example.twitteranalyzer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TwitterAnalyzerApplicationTests.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class TwitterAnalyzerApplicationTests {

    @Test
    public void contextLoads() {
    }

}
