package com.example.database_service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "deployments")
public class Deployment {
    @Id
    private String id;
    private String application;
    private String environment;
    private String status;
    private int duration;

    // Constructor
    public Deployment() {}

    // Getters and Setters (Generate these in your IDE)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getApplication() { return application; }
    public void setApplication(String application) { this.application = application; }
    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
}