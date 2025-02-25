package com.example.backend_service;

import com.example.backend_service.clients.DatabaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/api/metrics")
public class BackendController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping
    public String calculateMetrics() {
        List<Object> deployments = databaseClient.getDeployments();
        
        // Simple business logic
        int total = deployments.size();
        long successCount = deployments.stream()
            .filter(d -> ((LinkedHashMap) d).get("status").equals("Success"))
            .count();
        
        return String.format(
            "Total Deployments: %d | Success Rate: %.1f%%",
            total,
            (successCount * 100.0) / total
        );
    }
}