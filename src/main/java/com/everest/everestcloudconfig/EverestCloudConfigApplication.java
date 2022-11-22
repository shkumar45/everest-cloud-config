package com.everest.everestcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EverestCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverestCloudConfigApplication.class, args);
	}

}
