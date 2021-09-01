package com.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.collections.entities.Student;

class StudentSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class TreeSetDemo {
	
	public static void main(String[] args) {

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts1.add(19);
		ts1.add(28);
		ts1.add(28);
		ts1.add(10);
		ts1.add(37);
		//insertion order not preserved .. natural sorting (ascending)
		
		System.out.println("***ITERATING ts1****");
		Iterator<Integer> itr =  ts1.iterator();
		while(itr.hasNext()) {
			Integer number = (Integer)itr.next();
			System.out.println(number);
		}
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("HELLO");
		ts2.add("NAMASTE");
		ts2.add("SALUT");
		ts2.add("GREETINGS");
		
		System.out.println("***ITERATING ts2****");
		Iterator<String> sitr =  ts2.iterator();
		while(sitr.hasNext()) {
			String greet = (String)sitr.next();
			System.out.println(greet);
		}
		
		//customized sorting with TreeSet for sorting name of students
		
		Set<Student> studentSet = new TreeSet<Student>(new StudentSorter());
		Student studentObj = new Student("studentObj","economics");
		
		// adding 3 Student objects to studentSet
		studentSet.add(new Student("studE", "maths"));
		studentSet.add(studentObj);
		studentSet.add(new Student("studD", "maths"));
		studentSet.add(new Student("studC", "commerce"));
		studentSet.add(studentObj);

		System.out.println("***STUDENT LIST SORTED IN ASCENDING ORDER");
		Iterator<Student> studItr = studentSet.iterator();
		while(studItr.hasNext()) {
			Student student = (Student)studItr.next();
			System.out.println(student);
		}
		//insertion order not preserved...sorting done using compare(o1,o2) method
	}

}
