package com.StudentCrud.model;

public class Student 
{
 private int rno;
 private String name ;
 public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(int rno, String name, String tech) {
	super();
	this.rno = rno;
	this.name = name;
	this.tech = tech;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
private String tech;
 
}
