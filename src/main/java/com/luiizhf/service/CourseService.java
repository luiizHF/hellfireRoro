package com.luiizhf.service;

import java.util.List;

import com.luiizhf.entity.Course;

public interface CourseService {
	
	public abstract List<Course> listAllcourse();
	public abstract Course addCourse(Course course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);

}
