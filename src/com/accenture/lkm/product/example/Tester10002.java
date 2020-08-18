package com.accenture.lkm.product.example;

import java.util.List;

public class Tester10002 {
	
	public static void main(String[] args) {
		
		List<Product1> list = ProductUtility.getProductList();
		
		
		list.stream().filter((p)->{
						return p.getName().startsWith("I");
					}).forEach((fd)->{System.out.println(fd.getId()+","+fd.getPrice());});
		
		
		
	}

}
// print all the details of the product that start with I

/*interface Conumer<Product1>{
	void accept(Product1 pro);
	
}*/



/*
 * interface Predicate<Product1>{
 * 
 * 	boolean test(Prdocut1 p);
 * 
 * }
 * */