package com.example.demo.service;

import com.example.demo.model.HelloWorld;
import org.springframework.stereotype.Service;

import java.io.OutputStream;

/**
 * Created by hjt on 2018/7/8.
 */
@Service
public class HelloWorldServcie {
    public void print(HelloWorld helloWorld){
        System.out.println(helloWorld);
        String s = helloWorld.getName() + ",nihao";
        helloWorld.setName(s);
    }
}
