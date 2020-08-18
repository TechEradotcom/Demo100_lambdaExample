package com.accenture.lkm.product.example;

import java.util.List;

public class Tester10001 {
	
	public static void main(String[] args) {
		
		List<Product1> list = ProductUtility.getProductList();
		
		list.forEach((pro)->{System.out.println(pro.getId()+", "+pro.getName());});
		
		
		
	}

}
// print all the detail of all the product
/*interface Conumer<Product1>{
	void accept(Product1 pro);
	
}*/