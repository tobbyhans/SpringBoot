package com.udemy.converter;

import org.springframework.stereotype.Controller;

import com.udemy.entity.Course;
import com.udemy.model.CourseModel;

@Controller("courseConverter")
public class CourseConverter {

	// Entity --> Model
	public CourseModel entitytomodel(Course course) {
		
		CourseModel courseModel = new CourseModel();
		
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		
		return courseModel;
	}

	// Model --> Entity

	public Course modeltoentity(CourseModel courseModel) {
		Course course = new Course();
		
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		
		return course;

	}
}
