package com.accenture.lkm.product.example;

import java.util.List;

public class Tester10003 {

	public static void main(String[] args) {

		List<Product1> list = ProductUtility.getProductList();
		list.stream().filter((p)->{
			return p.getPrice()>20000f && p.getProductType().equals("N");
		}).forEach((per)->{System.out.println(per.getPrice()+", "+per.getName());});
		
		
	}

}

// give me the details of the product
// that are having price greater and 20000
// and have prodcutType N
/*
 * interface Predicate <Prodcut1>{
 * 		
 *	boolean test(Product p);
 * 
 *} 
 * 
 * 
 * interface Consumer<Prduct>{
 * 
 * 	void accept(product p);
 * 
 * }
 * */

