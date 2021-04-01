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
	private String prop11;
	private String prop2;
	private String prop21;
	private String prop3;
	private String prop31;
	private String prop4;
	private String prop41;
	private String prop5;
	private String prop51;
	private String prop6;
	private String prop61;
	private String prop7;
}
