package com.collections.list;

import com.collections.entities.Student;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Student> studentsList1 = new ArrayList<Student>();
		List<Student> studentsList2 = new LinkedList<Student>();
		
		//adding 3 Student objects to LinkedList studentList2
		studentsList2.add(new Student("studA", "maths"));
		studentsList2.add(new Student("studB", "science"));
		studentsList2.add(new Student("studC", "commerce"));
		
		
		//adding 4 Student objects to arrayList studentList1
		studentsList1.add(new Student("stud1", "cse"));
		studentsList1.add(new Student("stud2", "ece"));
		studentsList1.add(new Student("stud3", "me"));
		studentsList1.add(new Student("stud4", "cse"));
		
		//adding new Student object at 2nd index
		studentsList1.add(2, new Student("stud5","ece"));
		
		//adding the collection studentList2 to studentList1
		studentsList1.addAll(studentsList2);
		
		System.out.println("***StudentList1***");
		//iterating over studentList1 to display the list of all students
		Iterator itr = studentsList1.iterator();
		while(itr.hasNext()) {
			Student student = (Student)(itr.next());
			if(student.getSubject().equals("me")) {
				itr.remove();
			}
			else {
				System.out.println(student);
			}
		}
		
		System.out.println("***StudentList2(Reverse)***");
		//iterating over studentList2 using ListIterator to traverse elements in reverse
		ListIterator<Student> litr = studentsList2.listIterator(studentsList2.size());
		while(litr.hasPrevious()) {
			Student student = (Student)litr.previous();
			System.out.println(student);
		}
		
		System.out.println("****JDK 8 SYNTAXES****");
		
		//iterating a  simple list of elements
		//setting name
		//calling addData method for all stream elements
		studentsList1.stream().map(x->x.addData()).forEach(x->System.out.println(x));
		
		System.out.println("COUNTRIES CONTAINING H");
		//filtering elements from a list
		List<String> countries = Arrays.asList("India","Indonesia","Hong Kong");
		countries.stream().filter(c->c.contains("H")).forEach(y->System.out.println(y));
		
	}
}
