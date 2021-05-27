package com.ust.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties("project")
@Component
public class ConfigProps {
private String projectId;
private String projectName;
private String projectLocation;
private String projectCost;
private String projectStatus;
}
