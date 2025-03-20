package com.StudentCrud.controller;
 
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCrud.Service.StudentService;
import com.StudentCrud.model.Student;



@RestController
public class StudentController {
	
	@Autowired
    StudentService studentservice;
	
    @GetMapping("student")
	public List<Student> getStudent(){
	return studentservice.getStudents(); 
	}
    
   @GetMapping("student/{rno}")
   public Student getStudentByRno (@PathVariable("rno")int rno)
   {
	   return studentservice.getRno(rno);
   }
   @PostMapping("student")
    public  String addStudent(@RequestBody Student student) {
	  studentservice.addStudent(student);
	   return "success";
   }
   @PutMapping("student")
   public String updateStudent(@RequestBody Student student) {
	 return  studentservice.updateStudent(student);
	   }
   @DeleteMapping("student/{rno}")
   public String deleteStudent(@PathVariable int rno)
   {
	 return studentservice.deleteStudent( rno);
	  
	   
   }
    
}
