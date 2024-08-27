package com.example.sbm1.service;

import com.example.sbm1.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
