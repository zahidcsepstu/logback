package com.zahid.logback.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping(name = "/")
    public ResponseEntity<String> testController() {
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");
        return ResponseEntity.ok("Test Controller");
    }
}
