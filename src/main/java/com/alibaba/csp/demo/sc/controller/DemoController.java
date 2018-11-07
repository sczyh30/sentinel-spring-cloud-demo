package com.alibaba.csp.demo.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eric Zhao
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String apiHello() {
        return "Hello at " + System.currentTimeMillis();
    }
}
