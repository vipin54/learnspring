package SpringBoot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.courses.bean.Course;
import SpringBoot.courses.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	@GetMapping("/courses") 
	public List<Course> getAllCourses(){
		//return List.of(new Course(1,"Microservice", "Learn"),new Course(2,"Microservice", "Learn"));
		return repository.findAll();
	}
	
	@GetMapping("/courses/{id}") 
	public Course getAllCourses1(@PathVariable int id){
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id" + id);
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable int id ,@RequestBody Course course) {
		repository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable int id ) {
		repository.deleteById(id);
	}

}
