package com.pro.restApi1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
   // @GetMapping("/")
    //public String getDetails(){
      //  return "good";
    //}

    @GetMapping("/")
    public String getId(@RequestParam("id") String uid){
        return "user id "+ uid ;
    }
    public String

}
