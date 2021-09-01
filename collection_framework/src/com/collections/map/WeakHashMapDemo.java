package com.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.collections.entities.Student;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
//		Map<Student,String> studentMap = new HashMap<Student,String>();
		Map<Student,String> studentMap = new WeakHashMap<Student,String>();
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
		System.out.println(studentMap);
		s1 = null;
		System.gc();
//		Thread.sleep(5000);
		System.out.println(studentMap);
		
		//in the case of hashMap s1 did not get collected by GC	
		//whereas in the case of weakHashMap it is collected
	}

}
