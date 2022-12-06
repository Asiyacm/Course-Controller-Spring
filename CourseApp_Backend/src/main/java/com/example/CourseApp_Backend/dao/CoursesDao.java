package com.example.CourseApp_Backend.dao;

import com.example.CourseApp_Backend.Model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CoursesDao extends CrudRepository<Courses,Integer> {
}
