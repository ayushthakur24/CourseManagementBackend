package com.spring.RestAPI.SpringRESTAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.RestAPI.SpringRESTAPI.Entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
