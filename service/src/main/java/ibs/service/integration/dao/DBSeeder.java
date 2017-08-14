package ibs.service.integration.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ibs.domain.model.DomainCourse;

@Component
public class DBSeeder implements CommandLineRunner{

	private CourseRepository courseRepository;
	
	public DBSeeder(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		
		DomainCourse course1 = new DomainCourse(1001, "Java", "Professional");
		DomainCourse course2 = new DomainCourse(1002, ".Net", "Professional");
		DomainCourse course3 = new DomainCourse(1003, "Java", "Tutorial");
		
		List<DomainCourse> list = new ArrayList<>();
		list.add(course1);
		list.add(course2);
		list.add(course3);
		
		courseRepository.save(list);
	}
	

}
