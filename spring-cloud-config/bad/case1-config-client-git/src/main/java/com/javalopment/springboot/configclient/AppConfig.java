package com.javalopment.springboot.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties
@Getter @Setter
public class AppConfig {
	
	private String prop1;
	private String prop2;

}
