package com.example.database_service;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeploymentRepository extends MongoRepository<Deployment, String> {
}