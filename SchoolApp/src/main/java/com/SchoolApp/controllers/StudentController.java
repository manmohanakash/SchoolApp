package com.SchoolApp.controllers;

import java.util.List;
import java.util.Optional;
import com.SchoolApp.models.Student;
import com.SchoolApp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService StudentService;
	
	@RequestMapping("/students")
	public List<Student> getStudents(){
		return StudentService.getAllStudents();
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student student) {
		StudentService.addStudent(student);
	}
	
	 @RequestMapping("/student/{studentid}")
	public  Optional<Student> getStudent(@PathVariable String studentid) {
		return StudentService.getStudent(Integer.parseInt(studentid));
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/student")
	public void updateStudent(@RequestBody Student Student) {
		StudentService.updateStudent(Student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/student/{studentid}")
	public void updateStudent(@PathVariable String studentid) {
		StudentService.deleteStudent(studentid);
	}

}
