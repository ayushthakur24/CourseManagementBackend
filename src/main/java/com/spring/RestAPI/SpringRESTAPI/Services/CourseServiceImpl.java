package com.spring.RestAPI.SpringRESTAPI.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.RestAPI.SpringRESTAPI.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(124, "Java fundamentals", "This course is based on Java Programming"));
		list.add(new Course(126,"Python Fundamentals","This course is based on Python Programming"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		 
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		return course;
	}
	
	
}
