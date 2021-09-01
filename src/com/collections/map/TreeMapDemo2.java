package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.collections.entities.Student;
import com.collections.helper.StudentSorter;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		Map<Student, String> studentMap = new TreeMap<Student,String>(new StudentSorter());
		Student s1 = new Student("studA", "maths");
		Student s2 =new Student("studE", "cse");
		Student s3 =new Student("studD", "commerce");
		Student s4 =new Student("studC", "commerce");
		
		studentMap.put(s1, "indore");
		studentMap.put(s2,"delhi");
		studentMap.put(s3,"mumbai");
		studentMap.put(s4,"delhi");
		
		System.out.println(studentMap); //sorting of keys on the basis of student name
		
	}

}
