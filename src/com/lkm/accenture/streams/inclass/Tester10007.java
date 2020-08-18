package com.lkm.accenture.streams.inclass;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.accenture.lkm.product.example.Product1;
import com.accenture.lkm.product.example.ProductUtility;

public class Tester10007 {
	public static void main(String[] args) {
		List<Product1> list= ProductUtility.getProductList();
		List<Integer> pids=
		list.stream().map(new Function<Product1, Integer>() {

			@Override
			public Integer apply(Product1 t) {
				// TODO Auto-generated method stub
				return t.getId();
			}
			
		}).collect(Collectors.toList());
		
		
		Set<String> setName=	 
				list.stream().
				map(per->per.getName()).
				collect(Collectors.toSet());
		
		
		
	}

}
