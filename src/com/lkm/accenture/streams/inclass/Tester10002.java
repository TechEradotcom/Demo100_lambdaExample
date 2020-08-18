package com.lkm.accenture.streams.inclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester10002 {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(12);list.add(121);list.add(123);
		list.add(112);list.add(125);list.add(124);
		list.add(22);list.add(212);list.add(132);
		
	
		
		
		// Requirement: Filter the data so that odd number should 
		// be collected as Set<Interger>.
		
	/*	list.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				boolean ret=false;
				if(t%2==0){
					ret= true;
				}
				return ret;
			}
			
		});*/
		
		//list.stream().filter(x->{return x%2==0;});
		
		Set<Integer> set =
				list.stream().filter(x->x%2==0).collect(Collectors.toSet());
		
		set.forEach(x->System.out.print(x+"\t"));
		
		
		
		
		
		
		
		
		

		
	}

}
