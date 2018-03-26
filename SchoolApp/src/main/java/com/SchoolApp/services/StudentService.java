package com.SchoolApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.SchoolApp.models.Student;
import com.SchoolApp.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository StudentRepository;
	
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<Student>();
		StudentRepository.findAll().forEach(students::add);
		return students;
	}

	
	public void addStudent(Student student) {
		StudentRepository.save(student);
	}
	
	
	public Optional<Student> getStudent(int id) {
		return StudentRepository.findById(id);
		}
	
	public void updateStudent(Student student) {
		StudentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		StudentRepository.deleteById(Integer.parseInt(id));
	}
}
