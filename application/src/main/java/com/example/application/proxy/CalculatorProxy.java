package com.example.application.proxy;

import com.example.application.entity.NumberReq;
import com.example.application.entity.ResultObj;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "calculator-service")
@RibbonClient(name = "calculator-service")
public interface CalculatorProxy {

    @PostMapping("/calculate/plus")
    ResultObj plus(@RequestBody NumberReq req);

    @GetMapping("/calculate/minus/{num1}/and/{num2}")
    ResultObj minus(@PathVariable("num1") int num1, @PathVariable("num2") int num2);

}
