package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collections.entities.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
		Student s1 = new Student("studA", "maths");
		Student s2 =new Student("studB", "cse");
		Student s3 =new Student("studC", "commerce");
		Student s4 =new Student("studD", "commerce");
		
		studentMap.put(101, s1);
		studentMap.put(102, s2);
		studentMap.put(103, s3);
		studentMap.put(104, s4);
		
		System.out.println(studentMap); //order may or may not be preserved
		
		//removing student with key 104
		Set<Entry<Integer, Student>> studentEntrySet = studentMap.entrySet();
		Iterator<Entry<Integer,Student>> itr = studentEntrySet.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Student> entry = (Entry<Integer,Student>)itr.next();
			if(entry.getKey().equals(104)) {
				studentMap.remove(entry);
			}
			else {
				System.out.println(entry.getKey() +"..." + entry.getValue());
			}
		}
		
		System.out.println("***getting objects using keys***");
		System.out.println(studentMap.get(102));
		System.out.println(studentMap.get(104));
		
		System.out.println("JDK 8 syntax");
		studentMap.forEach((x,y)->System.out.println(x + "..."+y));
	}

}
