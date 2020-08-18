package com.accenture.lkm.product.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tester10011_Practice_InClass {
	
	public static void main(String[] args) {
		List<Product1> listPer =  ProductUtility.getProductList();
		
		List<String> listName= 
				listPer.stream()
				.map(x->x.getName()).
				collect(Collectors.toList());
		
		
		List<Integer> listIds= 
				listPer.stream()
				.map(x->x.getId()).
				collect(Collectors.toList());
		
		//first
		int max1=	listPer.stream()
				.mapToInt(x->x.getId()).max().getAsInt();	
		//2nd way	
		int max2=	listPer.stream()
			.map(x->x.getId()).max((i,j)->{
				int res=0;
				if(i>j){
					res=1;
				}
				else{
					res=-1;
				}
				return res;
			}).get();

		
		
		System.out.println("Max1: "+max1);
		System.out.println("Max2: "+max2);
		//3rdWay
		//listPer.stream().max()
		
		//4ht
		//listPer.stream().collect(Collectors.maxBy());
		
		
		
		
	}

}
