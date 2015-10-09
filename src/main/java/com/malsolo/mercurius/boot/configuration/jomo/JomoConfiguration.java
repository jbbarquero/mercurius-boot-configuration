package com.malsolo.mercurius.boot.configuration.jomo;

import javax.validation.constraints.NotNull;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("jomo")
@Data
public class JomoConfiguration {

    @NotNull
    private String name, host;

    @NotNull
    private Integer port;

    @NotNull
    private Boolean master;

}
