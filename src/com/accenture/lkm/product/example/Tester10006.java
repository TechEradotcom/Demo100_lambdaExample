package com.accenture.lkm.product.example;

import java.util.List;
import java.util.stream.Collectors;

public class Tester10006 {
	
	public static void main(String[] args) {
		List<Product1> list = ProductUtility.getProductList();
		// First
		double max=list.stream().map((p)->{return p.getPrice();}).max((p1,p2)->{
			int res=0;
			
			if(p1>p2){
				res=1;
			}else{
				res=-1;
			}
			return res;
		}).orElse(0.0f);
		System.out.println("Maximum: "+max);
		//2-----------------second Approach
		double max2	= list.stream().map((p)->{return p.getPrice();}).collect(Collectors.maxBy((p1,p2)->{
			int res=0;
			
			if(p1>p2){
				res=1;
			}else{
				res=-1;
			}
			
			return res;
		})).orElse(0.0f);
		
		System.out.println(max2);
		
		
		//3
		double max3= list.stream().mapToDouble((per)->{return per.getPrice();}).max().orElse(0.0);
		System.out.println(max3);
		
		
	}

}


/*class dummy implements Comparator<Double>{

	@Override
	public int compare(Doubleo1, Double o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}*/
// max, min
//e [Hint: use mapTODouble]  /use collector API / Map
// fin maximum price

//1st Approach, from stream<Product>->stream<double> (map) (comprator) computute max


///toDuoble<Product>{

///double applyAsDouble(Product);
//}

//interface Funcation<Product1, Double>{
// double accept(Product1 p);
//}

//2nd Apprach, from stream<Product>->stream<double> (map) and then use collector to find maximum and use comparator

//3 Aproach, from stream<Product>->stream<double> (mapToDouble) and use max, no comparator requried, 
// numeric fucnation are directrly supported by the result of mapToDouble

