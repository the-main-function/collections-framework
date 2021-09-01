package com.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;
import com.collections.entities.Student;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		//the equals method has been overridden in the Student class
		//identity hashMap uses the equals method to search for duplicates
		
		Map<Student,String> studentMap = new IdentityHashMap<Student,String>();
		Student s1 = new Student("studA", "maths");
		Student s2 =new Student("studB", "cse");
		Student s3 =new Student("studC", "commerce");
		Student s4 =new Student("studD", "commerce");
		Student s5 =new Student("studB", "commerce");
		
		studentMap.put(s1,"indore");
		studentMap.put(s2,"delhi");
		studentMap.put(s3,"mumbai");
		studentMap.put(s4,"indore");
		studentMap.put(s5,"hyderabad");
		//here s5 will not be added in the map since equals method will return true
		
		System.out.println(studentMap);
		
	}

}
