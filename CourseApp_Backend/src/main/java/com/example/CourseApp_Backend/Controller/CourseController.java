package com.example.CourseApp_Backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/add")
    public String Addpage(){
        return "Welcome to course add page";
    }

    @GetMapping("/")
    public String Viewpage(){
        return "Welcome to course view page";
    }


}
