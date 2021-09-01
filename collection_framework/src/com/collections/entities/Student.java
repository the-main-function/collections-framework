package com.collections.entities;

public class Student {

	private String name;
	private String subject;
	
	public Student addData(){
		System.out.println(this.getName()+"****");
		return this;
	}
	
	public Student(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student :: "+name+" - " +subject;
	}
	
	@Override
	public boolean equals(Object o) {
		Student student = (Student)o;
		String name = student.getName();
		if(this.name.equals(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	 
}


