package com.formsapp;

import org.springframework.boot.SpringApplication;

public class TestFormsAppConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.from(FormsAppConsumerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
