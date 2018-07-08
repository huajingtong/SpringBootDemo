package com.example.demo.controller;

import com.example.demo.model.HelloWorld;
import com.example.demo.service.HelloWorldServcie;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.image.BufferedImageGraphicsConfig;

import java.math.BigDecimal;

/**
 * Created by hjt on 2018/7/8.
 */
@Controller
public class HelloWorldController {
    @Autowired
    HelloWorldServcie helloWorldServcie;

    @RequestMapping("/nihao")
    @ResponseBody
    public HelloWorld print(@RequestParam(name = "hjt",defaultValue = "123") String hjt, HelloWorld helloWorld){
        System.out.println(hjt);
        helloWorldServcie.print(helloWorld);
        return helloWorld;
    }

    @RequestMapping("/invest")
    @ResponseBody
    public String invest(BigDecimal amount,Integer userId,Integer loanId){

        BigDecimal beginAmount = new BigDecimal("100");
        if (amount.doubleValue() < beginAmount.doubleValue()){
            return "不满足起投金额";
        }
        return "投资成功";
    }
}
