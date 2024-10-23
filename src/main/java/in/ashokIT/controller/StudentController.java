package in.ashokIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokIT.entity.Student;
import in.ashokIT.repo.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student) {
		
		 repository.save(student);
		
		return "student save";
	}

	
	@GetMapping("/students")
	public Iterable<Student> getStudent() {
		
		return repository.findAll();
		
	}
	
	
}
