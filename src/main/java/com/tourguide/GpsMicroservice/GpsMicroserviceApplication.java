package com.tourguide.GpsMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Locale;

@SpringBootApplication
@EnableConfigurationProperties
public class GpsMicroserviceApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(GpsMicroserviceApplication.class, args);
	}
}
