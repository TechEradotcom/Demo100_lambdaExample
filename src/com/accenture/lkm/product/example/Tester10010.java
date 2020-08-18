package com.accenture.lkm.product.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester10010 {
	public static void main(String[] args) {
		List<Product1> list = ProductUtility.getProductList();
		
		/*double maxPrice= list.stream().mapToDouble((x)->{return x.getPrice();}).max().orElse(0.0);
		
		Set<Product1> set= list.stream().filter((per)->{return per.getPrice()==maxPrice;}).collect(Collectors.toSet());
		
		System.out.println(maxPrice);
		
		set.stream().forEach(x->{System.out.println(x.getId()+","+x.getName()+","+x.getPrice());});*/
		
		
		
		double d = list.stream().mapToDouble(x->x.getPrice()).max().orElse(0.0);
		Set<Product1> set = list.stream().filter(x->(x.getPrice()==d)).collect(Collectors.toSet());
		set.forEach(x->{
			System.out.println(x.getId()+" :"+x.getName());
			
		});
		
		
	}

}
// Write a Lambda to Find Products
// that have maximum price

//interface ToDouble<Product1>{
//   double applyAsDouble(Product)
//}

//iterface Predicate<Product>{
	//boolean test(Prduct); 
//}



// iterface Consumer<Product1>{
//  void accept(Prodcut1 );

//}