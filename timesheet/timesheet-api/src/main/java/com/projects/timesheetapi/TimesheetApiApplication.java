package com.projects.timesheetapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.projects.timesheetapi.repository")
public class TimesheetApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimesheetApiApplication.class, args);
    }

}
