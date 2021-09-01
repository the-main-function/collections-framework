package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.collections.entities.Student;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<Student> studentSet = new LinkedHashSet<Student>();

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
		//insertion order preserved .. duplicates not added
	}

}
