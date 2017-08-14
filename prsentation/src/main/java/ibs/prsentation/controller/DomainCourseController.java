package ibs.prsentation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ibs.domain.model.DomainCourse;
import ibs.service.integration.dao.CourseRepository;

@RestController
public class DomainCourseController {
	private CourseRepository courseRepository;

	public DomainCourseController(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	} 
	
	@GetMapping("/allCourse")
	public List<DomainCourse> getAllCourse(){
		
		List<DomainCourse> courses = courseRepository.findAll();
		
		return courses;
	}
	
}
