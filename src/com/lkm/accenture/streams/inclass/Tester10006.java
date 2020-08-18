package com.lkm.accenture.streams.inclass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Tester10006 {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(12);list.add(121);list.add(123);
		list.add(3112);list.add(125);list.add(124);
		list.add(22);list.add(212);list.add(132);
	
		// Requirement: find the maximum of all elements		
		// 2 Approach, Collector API

		/*int max=	list.stream().mapToInt(new ToIntFunction<Integer>(){
			@Override
			public int applyAsInt(Integer value) {
				// TODO Auto-generated method stub
				return value;
			}
			
		}).max().getAsInt();	*/
		
		int max=	list.stream().mapToInt(x->x).max().getAsInt();	
		System.out.println(max);
		
	}

}
