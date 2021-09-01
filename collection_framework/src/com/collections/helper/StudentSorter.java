package com.collections.helper;

import java.util.Comparator;

import com.collections.entities.Student;

public class StudentSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
