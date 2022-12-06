package com.example.CourseApp_Backend.Controller;

import com.example.CourseApp_Backend.Model.Courses;
import com.example.CourseApp_Backend.dao.CoursesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CoursesDao dao;

    @GetMapping("/")

    public String Homepage(){

        return("Welcome to home page");

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
        public List<Courses> viewCourse(){
        return(List<Courses>)dao.findAll() ;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Courses c){
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "Course Added Successfully";
    }

}
