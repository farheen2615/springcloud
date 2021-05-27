package com.ust.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties("credentials")
@Component
public class ConfigProps {
private String username;
private String password;
private String attempt;
}
