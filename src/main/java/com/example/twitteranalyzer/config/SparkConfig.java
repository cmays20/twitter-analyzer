package com.example.twitteranalyzer.config;

import org.apache.spark.SparkConf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {
    @Value("${spark.appName:JavaDirectKafkaHashTagAnalyzer}")
    private String sparkAppName;

    @Value("${spark.cassandra.connection.host}")
    private String cassandraHost;

    @Value("${spark.masterUrl:local[1]}")
    private String masterUrl;

    @Bean
    public SparkConf sparkConf() {
        return new SparkConf()
                .setAppName(sparkAppName)
                .set("spark.executor.memory","1g")
                .set("spark.cassandra.connection.host",cassandraHost)
                .setMaster(masterUrl);
    }
}
