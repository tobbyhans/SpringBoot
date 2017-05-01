package com.udemy.repository;


import java.io.Serializable;

import org.springframework.stereotype.Repository;



@Repository("CourseJpaRepository")
public interface CourseJpaRepository <Course extends Serializable>{

	
}
