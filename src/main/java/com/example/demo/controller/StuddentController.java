package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("api/v1/students")
public class StuddentController {

	
	private static final List<Student> STUDENTS = Arrays.asList(
			new Student(1l, "Junior"),
			new Student(1l, "Zora")
			);
	
	@GetMapping(path = "{studentId}")
	public Student getStudent(@PathVariable Long studentId) {
		return STUDENTS.stream().filter(student -> student.equals(studentId))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Student " + studentId + " does not exists! "));
	}
}
