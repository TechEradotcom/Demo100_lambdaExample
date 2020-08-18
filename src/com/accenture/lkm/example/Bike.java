package com.accenture.lkm.example;
class Bike{
	private int bikeId;
	private String bikeName;
	private double price;
	public Bike(){System.out.println("DEfault");}
	public Bike(int bikeId){System.out.println("Param1");}
	public Bike(int bikeId,String bikeName){
		System.out.println("Param2");
	}
	
	public void printDetails(){
		System.out.println(bikeId);
		System.out.println(bikeName);
	}
	public double computeTaxPrice(double tax){
		return price+price*tax/100;
	}
	
	static public void printDummystatic1(){
		System.out.println("Hello World....");
	}
	static public void printDummystatic2(int dummy){
		System.out.println("Hello World"+dummy);
	}
	
}