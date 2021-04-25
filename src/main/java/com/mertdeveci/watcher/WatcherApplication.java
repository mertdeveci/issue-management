package com.mertdeveci.watcher;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WatcherApplication {

	public static void main(String[] args) {

		SpringApplication.run(WatcherApplication.class, args);

	}

	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
