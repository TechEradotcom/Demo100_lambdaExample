package com.accenture.lkm.product.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DummyTester10011 {
	
	public static void main(String[] args) {
		/*List<Product1> list =ProductUtility.getProductList();
		
		Map<String,List<Product1>> map= list.stream().collect(Collectors.groupingBy(x->x.getProductType()));
		
		map.forEach((k,v)->{
			System.out.println("Key: "+k);
			v.stream().forEach(x->System.out.println(x.getId()+","+x.getName()));
			System.out.println();
		});*/
		
		
		System.out.println("=====");
		List<Product1> list =ProductUtility.getProductList();
		
	/*	Map<Integer, String> map= list.stream().filter(x->x.getName().startsWith("I")).
		collect(Collectors.toMap(x->x.getId(), x->x.getName()));
*/

		Map<Integer, String> map2= list.stream().filter(x->x.getName().startsWith("I")).
		collect(Collectors.toMap(x->x.getId(),
								 x->x.getName(),
								(old,newValue)->"[Old"+old+" new: "+newValue+"]")
								);
		
		System.out.println(map2);
		System.out.println(map2.get(5));
		
	}

}
