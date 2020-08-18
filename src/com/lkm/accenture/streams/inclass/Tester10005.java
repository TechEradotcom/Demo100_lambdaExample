package com.lkm.accenture.streams.inclass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester10005 {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(12);list.add(121);list.add(123);
		list.add(3112);list.add(125);list.add(124);
		list.add(22);list.add(212);list.add(132);
	
		// Requirement: find the maximum of all elements		
		// 2 Approach, Collector API

		int max=	list.stream().map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t;
			}
			
		}).max(
				(Integer o1, Integer o2)-> {
			// TODO Auto-generated method stub
			int i=0;
			if(o1>o2){
				i=1;
			}
			else{
				i=-1;
			}
			return i;
		}).get();
		
		
		System.out.println(max);
		
	}

}
