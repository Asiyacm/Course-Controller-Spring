package com.example.CourseApp_Backend.Controller;

import com.example.CourseApp_Backend.Model.Courses;
import com.example.CourseApp_Backend.dao.CoursesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CoursesDao dao;
    @GetMapping("/")
        public List<Courses> viewpage(){
        return(List<Courses>)dao.findAll() ;
    }


    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "Course Added Successfully";
    }

}
