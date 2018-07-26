package com.sunseaiot.crm.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FileUploadApplication {
	public static void main(String[] args) throws Exception{
		SpringApplication.run(FileUploadApplication.class, args);
		
		System.out.println("lamda");
			}
	

}
