package com.sougata.crud_webservice;

import com.sougata.crud_webservice.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
        FileStorageProperties.class
})
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class CrudWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWebserviceApplication.class, args);
	}

}
