package com.accenture.lkm.example;

class  Car2{
	
	Car2(){
		System.out.println("Default");
	}

	Car2(int a){
		System.out.println("Parameter");
	}
}

interface Car2Default{
	Car2 defaultFoolConstCar();
}


interface Car2Parameter{
	Car2 paramFoolConstCar(int p);
}

public class Tester10016_Method_ReferenceForConstructor {
	public static void main(String[] args) {
	
		Car2Default carDef =  Car2::new;
		
		Car2Parameter carParam = Car2::new;
		
		
		
		//invocation
		Car2 car= carDef.defaultFoolConstCar();
		
		Car2 paramCar = carParam.paramFoolConstCar(12);
		
		
		
	}

}
