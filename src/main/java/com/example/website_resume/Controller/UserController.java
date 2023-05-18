package com.example.website_resume.Controller;

import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resume")
public class UserController {

    @GetMapping("/")
    public  String getIndex(){
        return "index";
    }

    @GetMapping("/MsdTelematics")
    public String getMsdTelematics(){
        return "msdtelematics";
    }


    @GetMapping("/CMS")
    public String getContactManagementSystem(){
        return "ContactManagementSystem";
    }

    @GetMapping("/ANTINO")
    public String getAntinoExperience(){
        return "Antino";
    }

    @GetMapping("/INTERWORK")
    public String getInterworkExperience(){
        return "Interwork";
    }

}
