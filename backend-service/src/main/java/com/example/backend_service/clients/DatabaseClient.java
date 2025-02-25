package com.example.backend_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "database-service", url = "${database.service.url}")
public interface DatabaseClient {
    @GetMapping("/api/deployments")
    List<Object> getDeployments();
}

