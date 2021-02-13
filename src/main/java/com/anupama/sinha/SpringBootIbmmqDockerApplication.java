package com.anupama.sinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootIbmmqDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIbmmqDockerApplication.class, args);
	}

}
