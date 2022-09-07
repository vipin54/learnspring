package SpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
