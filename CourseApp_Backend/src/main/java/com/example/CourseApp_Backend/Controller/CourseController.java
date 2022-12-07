package com.example.CourseApp_Backend.Controller;

import com.example.CourseApp_Backend.Model.Courses;
import com.example.CourseApp_Backend.dao.CoursesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @Autowired
    private CoursesDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")

    public String Homepage(){

        return "Welcome to home page";

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
        public List<Courses> viewCourse(){
        return(List<Courses>)dao.findAll() ;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Courses> searchCourse(@RequestBody Courses c) {
        String title = String.valueOf(c.getTitle());
        System.out.println(title);
        return (List<Courses>)dao.Search(c.getTitle());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> addCourse(@RequestBody Courses c) {
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

}
