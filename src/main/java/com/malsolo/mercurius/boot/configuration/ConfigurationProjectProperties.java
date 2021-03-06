package com.malsolo.mercurius.boot.configuration;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("configuration")
@Data
public class ConfigurationProjectProperties {

	private String projectName;

}
