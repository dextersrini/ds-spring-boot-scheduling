package com.ds.scheduling.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.ds")
public class ScheduleRunner {
	public static void main(String[] args) {
		SpringApplication.run(ScheduleRunner.class);
	}
}
