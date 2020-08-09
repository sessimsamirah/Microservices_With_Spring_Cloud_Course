package com.springcourse.springcloudmicroservicescourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.springcourse.springcloudmicroservicescourse.controller"})
public class SpringCloudMicroservicesCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroservicesCourseApplication.class, args);
	}
}