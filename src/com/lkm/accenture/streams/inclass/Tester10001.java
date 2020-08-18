package com.lkm.accenture.streams.inclass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tester10001 {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(12);list.add(121);list.add(123);
		list.add(112);list.add(125);list.add(124);
		list.add(22);list.add(212);list.add(132);
		
		Consumer<Integer> con = x->System.out.println(x);
		list.forEach(con);
		list.forEach(x->System.out.println(x));
		
		
		
		// Requirement:
		
		
		
		
		
		
		
	/*	list.stream().forEach( new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+"\t");
			}
			
		});
		
	//list.stream().forEach(x->System.out.print(x+"\t"));	
		list.stream().forEach(System.out::print);	*/
		
	}

}
