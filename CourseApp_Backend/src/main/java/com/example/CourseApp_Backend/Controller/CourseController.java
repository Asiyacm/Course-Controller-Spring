package com.example.CourseApp_Backend.Controller;

import com.example.CourseApp_Backend.Model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Viewpage(){
        return "Welcome to course view page";
    }


    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        return "Course Added Successfully";
    }

}
