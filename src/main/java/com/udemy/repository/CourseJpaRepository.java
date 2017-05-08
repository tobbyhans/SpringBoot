 package com.udemy.repository;

 import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.Course;

 @Repository("courseJpaRepository")
 public interface CourseJpaRepository extends JpaRepository<Course, Serializable>{
	 
	//Consultas con jpareposytory
	 public abstract Course findByPrice(int price);
	 
	 public abstract Course findByNameAndprice(String name , int price);
	 
	 public abstract List<Course>  findByNameOrderByHours(String name);

 }
