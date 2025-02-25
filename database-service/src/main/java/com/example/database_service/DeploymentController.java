package com.example.database_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deployments")
public class DeploymentController {

    @Autowired
    private DeploymentRepository repository;

    @PostMapping
    public Deployment createDeployment(@RequestBody Deployment deployment) {
        return repository.save(deployment);
    }

    @GetMapping
    public List<Deployment> getAllDeployments() {
        return repository.findAll();
    }
}