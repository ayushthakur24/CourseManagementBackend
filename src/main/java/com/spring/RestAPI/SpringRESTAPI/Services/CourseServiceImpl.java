package com.spring.RestAPI.SpringRESTAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.RestAPI.SpringRESTAPI.Dao.CourseDao;
import com.spring.RestAPI.SpringRESTAPI.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	
	
	@Autowired
	private CourseDao courseDao;
	
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(111, "Java fundamentals", "This course is based on Java Programming"));
//		list.add(new Course(112,"Python Fundamentals","This course is based on Python Programming"));
//		list.add(new Course(113, "C++ fundamentals", "This course is based on C++ Programming"));
//		list.add(new Course(114, "C fundamentals", "This course is based on C Programming"));

	}
	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		//Course c = null;
//		 
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		//list = this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	
}
