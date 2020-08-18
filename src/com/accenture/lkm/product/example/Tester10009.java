package com.accenture.lkm.product.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Tester10009 {

	public static void main(String[] args) {
		List<Product1> list = ProductUtility.getProductList();
		
		
		Map<String,List<Product1>> map=
		list.stream().collect(Collectors.groupingBy((per)->{return per.getProductType();}));
		
		Set<Entry<String, List<Product1>>> set= map.entrySet();
		
		for (Entry<String, List<Product1>> entry : set) {
			System.out.println(entry.getKey());
			System.out.println("-----------------");
			List<Product1> listPR=  entry.getValue();
			listPR.forEach(h->{System.out.println(h.getId()+", "+h.getName());});
			System.out.println("\n\n");
		}
		
		
		
		
		
		
	}
}
//interface Function <Prodcut,String>{
	//String apply(Product)
//}


// interface Consumer<Product1>{
		//accept(Product t)
//}
