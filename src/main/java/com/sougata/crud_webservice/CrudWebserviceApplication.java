package com.sougata.crud_webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class CrudWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWebserviceApplication.class, args);
	}

}
