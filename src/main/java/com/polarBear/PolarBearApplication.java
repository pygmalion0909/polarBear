package com.polarBear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class PolarBearApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolarBearApplication.class, args);
	}

}
