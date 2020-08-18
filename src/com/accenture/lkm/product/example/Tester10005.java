package com.accenture.lkm.product.example;

import java.util.List;
import java.util.stream.Collectors;

public class Tester10005 {
	
	public static void main(String[] args) {
		List<Product1> list = ProductUtility.getProductList();
	
		//Collector API
		double sum=list.stream().map((prod)->{return prod.getPrice();}).collect(Collectors.summingDouble((d)->{return d;}));
		System.out.println(">>>"+sum);
		
		
		// second approach
		// use MapToDouble, will convert only to Stream<Double>
		double sum2= list.stream().mapToDouble((pr)->{return pr.getPrice();}).sum();
		System.out.println(sum2);
		
		
	}

}
// sum of Price
//interface ToDoubleFunction<Product1>{
//	Double  applyAsDouble(Product1 d)
//}
// sum , avergae, count