package com.SchoolApp.repository;

import org.springframework.data.repository.CrudRepository;
import com.SchoolApp.models.Student;


public interface StudentRepository extends CrudRepository<Student,Integer>{

}
