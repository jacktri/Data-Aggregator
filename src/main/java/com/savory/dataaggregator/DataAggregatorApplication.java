package com.savory.dataaggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.savory.proto.Payload;

@SpringBootApplication
public class DataAggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataAggregatorApplication.class, args);
    }
}
