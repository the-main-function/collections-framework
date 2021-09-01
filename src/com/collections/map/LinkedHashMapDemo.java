package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import com.collections.entities.Student;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap = new LinkedHashMap<Integer,Student>();
		Student s1 = new Student("studA", "maths");
		Student s2 =new Student("studB", "cse");
		Student s3 =new Student("studC", "commerce");
		Student s4 =new Student("studD", "commerce");
		
		studentMap.put(101, s1);
		studentMap.put(102, s2);
		studentMap.put(103, s3);
		studentMap.put(104, s4);
		
		System.out.println(studentMap); //insertion order will be preserved
		
	}

}
