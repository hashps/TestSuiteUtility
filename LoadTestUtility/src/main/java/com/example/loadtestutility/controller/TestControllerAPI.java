package com.example.loadtestutility.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utility")
public class TestControllerAPI {

    @RequestMapping(value = "/Health", produces = "application/json", method = RequestMethod.GET)
    public String healthCheck() {
        return "OK";
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public String acceptJson(@RequestBody String string) {
        return string;
    }

}
