package com.TC.server1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String getIndexpage() {
        System.out.println("inside indexpage");
        return "index"; // Refers to /WEB-INF/views/index.jsp
    }

    @RequestMapping("/admin")
    public String getAdminpage() {
        System.out.println("inside adminpage");
        return "admin"; // Refers to /WEB-INF/views/admin.jsp
    }
}
