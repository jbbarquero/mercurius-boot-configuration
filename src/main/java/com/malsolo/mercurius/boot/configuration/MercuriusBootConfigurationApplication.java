package com.malsolo.mercurius.boot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySource("classpath:jomo.properties")
public class MercuriusBootConfigurationApplication {

    @Value("${configuration.projectName}")
    void setProjectName(String projectName) {
        System.err.println("setting project name: " + projectName);
    }

    @Autowired
    void setEnvironment(Environment env) {
        System.err.println("setting environment: " + env.getProperty("configuration.projectName"));
    }

    @Autowired
    void setConfigurationProjectProperties(ConfigurationProjectProperties cp) {
        System.err.println("configurationProjectProperties.projectName = " + cp.getProjectName());
    }

    public static void main(String[] args) {
        SpringApplication.run(MercuriusBootConfigurationApplication.class, args);
    }
}
