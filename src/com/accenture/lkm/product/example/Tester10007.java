package com.accenture.lkm.product.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester10007 {

	public static void main(String[] args) {
		List<Product1> list = ProductUtility.getProductList();
		
		
		Map<Integer,String> map2 =  null;
		
		
		
		map2= list.stream().filter((per)->{return per.getName().startsWith("I");})
		.collect(Collectors.toMap((per)->{return per.getId();}     ,     (t)->{ return t.getName();}));
		
		;
		
		System.out.println(map2);
		
	}
}

/*Collect the details of the product having name starting with I 
 * as map, id should be key
 * and value shuld be name of the product
 */
/*
 *interface Predicate<Product1>{
 *	boolean	test (Product);
 * }
 * interafce Funcation<Prodcut,Integer>{
 * 	Integer apply(Product t);
 * }
 * 
 * interafce Funcation<Prodcut,String>{
 * 	String apply(Product t);
 * }
 * 
 * */
 