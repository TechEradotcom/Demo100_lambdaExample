package com.lkm.accenture.streams.inclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tester10003 {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(12);list.add(121);list.add(123);
		list.add(3112);list.add(125);list.add(124);
		list.add(22);list.add(212);list.add(132);
		
	
		
		
		// Requirement: find the maximum of all elements
		
		// 1 Approach, Stream API
	/*int max=	list.stream().max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int i=0;
				if(o1>o2){
					i=1;
				}
				else{
					i=-1;
				}
				return i;
			}
			
		}).get();*/
		int max=	list.stream().max((Integer o1, Integer o2)-> {
				// TODO Auto-generated method stub
				int i=0;
				if(o1>o2){
					i=1;
				}
				else{
					i=-1;
				}
				return i;
			}
		).get();
		
	System.out.println(max);
		
	}

}
