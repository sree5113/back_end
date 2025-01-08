package com.example.d2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }
    @RequestMapping("/admin")
    public String getAdminPage(){
        return "admin";
    }
    @RequestMapping("/user")
    public String getUserPage(){
        return "user";
    }
}
