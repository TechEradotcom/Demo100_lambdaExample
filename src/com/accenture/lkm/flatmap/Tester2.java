package com.accenture.lkm.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester2 {
	public static void main(String[] args) {
		
		Student student1 = new Student(1001, "Jack",  Arrays.asList("Sub1","Sub2"));
		Student student2 = new Student(1002, "Amy",   Arrays.asList("Sub3","Sub4"));
		Student student3 = new Student(1003, "Jason", Arrays.asList("Sub5","Sub6"));
		Student student4 = new Student(1004, "Tim",   Arrays.asList("Sub7","Sub8"));
		
		
		List<Student> list  = Arrays.asList(student1,student2,student3,student4);
		
		List<Integer> list2= list.stream().map(x->x.getStudentId()).collect(Collectors.toList());
		
		
		List<String> list3=list.stream().flatMap(x->x.getSubject().stream()) //Stream1+Stream2+Stream3== All Strings 
		.collect(Collectors.toList());
		System.out.println(list3);
	}

}
