package com.accenture.lkm.example;
interface MyInterFace {
	public void printDetails();
}

interface MyDefConst{
	Bike someMethod();
}


interface MyParamfConst{
	Bike someMethod(int param);
}
public class Tester10017_Assignment {

	public static void main(String[] args) {
		
		String str ="";
		
		MyInterFace itf = new Bike()::printDetails;
		
		itf.printDetails();
		
		
		MyInterFace itf2 = Bike::printDummystatic1;
		
		itf2.printDetails();
				
		
		
		MyParamfConst param =  Bike::new;
		
		Bike bike=param.someMethod(12);
		
	}

}
