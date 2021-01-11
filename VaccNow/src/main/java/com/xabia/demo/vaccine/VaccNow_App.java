package com.xabia.demo.vaccine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class VaccNow_App {

	public static void main(String[] args) {
		SpringApplication.run(VaccNow_App.class, args);
	}
}
