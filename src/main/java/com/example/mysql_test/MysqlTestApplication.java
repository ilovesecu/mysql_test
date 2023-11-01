package com.example.mysql_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MysqlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlTestApplication.class, args);
	}

}
