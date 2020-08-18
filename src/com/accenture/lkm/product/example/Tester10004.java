package com.accenture.lkm.product.example;

import java.util.List;

public class Tester10004 {
	public static void main(String[] args) {

		List<Product1> list =  ProductUtility.getProductList();
		
		list.stream().filter((pro)->{return pro.getName().length()<=3;}).forEach(x->System.out.println(x.getId()+"," +x.getName()));
		
		
		
	}

}


// give me the details of all the products having length of name less than or equal to 3
// product1,
////ISt imagin interfac
//interface Predicate<Produt1>{
//	boolean test(produc1); //2nd Step imagin method
//}

///interface Consumer<Product1>{
///
// void accept(product1)
///}
