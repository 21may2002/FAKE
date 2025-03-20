package com.StudentCrud.Service;

import java.util.ArrayList;


import java.util.Arrays;
 import java.util.List;

import org.springframework.stereotype.Service;
import com.StudentCrud.model.Student;
@Service
public class StudentService {
	
	  List<Student>students= new ArrayList<>(
			Arrays.asList(
			new Student(1,"jashua","AI"),
			new Student(2,"josh","java")
			)
			);
		

	public List<Student> getStudents() {
	return students;
	}


	public Student getRno(int rollno) {
	  int index =0;
	  boolean found =false;
	  for(int i=0;i<students.size();i++)
	  {
		  if(students.get(i).getRno()==rollno)
		  {
			  index=i;
			  found =true;
			  
			// first example return students.get(0);
			  
		  }
	  }
	  if (found) return students.get( rollno);
	  else return new Student (0,"","");
		
	 
	}


	public void addStudent(Student student) {
	 
		students.add(student);	}


	public String updateStudent(Student student) 
	{
		int index =0;
	boolean found =false;
		  for(int i=0;i<students.size();i++)
		  {
			  if(students.get(i).getRno()==student.getRno())
			  {
				  index=i;
				  found =true;
				  break;
			  }
			  }
		  if (found==false)return " no such students exist";
		  else 
		  {
			  students.set(index, student);
			  return "updation";
		  }
	
	
	
	}


	public String deleteStudent(int rno) {

		int index =0;
	boolean found =false;
		  for(int i=0;i<students.size();i++)
		  {
			  if(students.get(i).getRno()==rno)
			  {
				  index=i;
				  found =true;
				  break;
			  }
			  }
		  if (found==true) {
			  students.remove(index) ;
		  
		  return "deleted Successfullly";
		  }
		  else {
			  return "no sunch Student";
			  
			 
		  }
	
	}
}
