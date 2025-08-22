package com.hwong.poc.containerization.backend.rest.controller;


import com.hwong.poc.containerization.backend.dao.mapper.PostgresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private PostgresMapper postgresMapper;

    @Value("${sample.property:default}")
    private String sampleProperty;

    @GetMapping("")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(postgresMapper.getTestDatabaseObjects().toString());
    }
}
