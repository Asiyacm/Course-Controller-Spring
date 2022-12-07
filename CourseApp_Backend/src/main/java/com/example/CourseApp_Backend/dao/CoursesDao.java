package com.example.CourseApp_Backend.dao;

import com.example.CourseApp_Backend.Model.Courses;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursesDao extends CrudRepository<Courses,Integer> {

    @Query(value = "SELECT `id`, `date`, `description`, `duration`, `title`, `venue` FROM `courses` WHERE `title` LIKE %:title%",nativeQuery = true)
    List<Courses>Search(@Param("title") String title);
}
