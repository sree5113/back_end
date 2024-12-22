package com.pro.webapis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class user {

    @GetMapping("/")
    public String getdata(){
        return "hello";
    }
}
