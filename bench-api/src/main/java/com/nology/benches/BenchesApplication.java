package com.nology.benches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class BenchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenchesApplication.class, args);
	}

}
