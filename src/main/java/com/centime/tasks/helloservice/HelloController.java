package com.centime.tasks.helloservice;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Operation(summary = "Fetch a string 'Hello' wrapped with a spring response entity")
    @GetMapping("/hello")
    public ResponseEntity<String> getHello(@RequestHeader("traceId") String traceId) {
        return ResponseEntity.ok("Hello");
    }
}
