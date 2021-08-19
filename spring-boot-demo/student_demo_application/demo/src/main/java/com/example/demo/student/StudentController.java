package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		//super();
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student){
		studentService.addNewStudent(student);
	}
}
