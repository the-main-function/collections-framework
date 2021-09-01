package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collections.entities.Student;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Student> studentSet = new HashSet<Student>();

		Student studentObj = new Student("studentObj","economics");
		
		// adding 3 Student objects to studentSet
		studentSet.add(new Student("studA", "maths"));
		studentSet.add(studentObj);
		studentSet.add(new Student("studB", "maths"));
		studentSet.add(new Student("studC", "commerce"));
		studentSet.add(studentObj);

		Iterator<Student> itr = studentSet.iterator();
		while(itr.hasNext()) {
			Student student = (Student)itr.next();
			System.out.println(student);
		}
		//no insertion order preserved .. duplicates not added
		
		System.out.println("JDK 8");
		//filtering student with studentName studC
		studentSet.stream().filter(student->student.getName().equals("studC")).forEach(student->System.out.println(student));
		
		System.out.println("FOR EACH ON STREAM API");
		studentSet.stream().forEach(student->System.out.println(student));
	}

}
