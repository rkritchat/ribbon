package com.example.application.controller;

import com.example.application.entity.NumberReq;
import com.example.application.entity.ResultObj;
import com.example.application.proxy.CalculatorProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @Autowired
    private CalculatorProxy proxy;

    @GetMapping("/{num1}/{oper}/{num2}")
    public ResultObj test(@PathVariable("num1") int num1, @PathVariable("oper") String oper, @PathVariable("num2") int num2) {
        if ("p".equalsIgnoreCase(oper)) {
            return proxy.plus(new NumberReq(num1, num2));
        } else {
            return proxy.minus(num1, num2);
        }
    }
}
