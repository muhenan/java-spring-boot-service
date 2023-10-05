package com.allenmu.javaspringbootservice.controller;

import com.allenmu.javaspringbootservice.dto.PersonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Hello world, from spring boot");
    }

    @PostMapping
    public ResponseEntity<String> postTest(@RequestBody PersonDto personDto) {
        return ResponseEntity.ok("Response is: " + personDto.getName());
    }
}
