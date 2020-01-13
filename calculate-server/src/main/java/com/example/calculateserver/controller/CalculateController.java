package com.example.calculateserver.controller;

import com.example.calculateserver.entity.NumberReq;
import com.example.calculateserver.entity.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @Autowired
    private Environment environment;

    @PostMapping("/plus")
    public ResultObj plus(@RequestBody NumberReq req) {
        System.out.println(environment.getProperty("server.port"));
        return new ResultObj(req.getNum1() + req.getNum2());
    }

    @GetMapping("/minus/{num1}/and/{num2}")
    public ResultObj minis(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return new ResultObj(num1 - num2);
    }
}
