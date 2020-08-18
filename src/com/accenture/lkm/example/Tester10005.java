package com.accenture.lkm.example;

public class Tester10005 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();
		
		//Case1: Without Type  inferencing
		//for a paramterList execute the body after the arrow:
		/*MathOperation mathOperation1 = (int a, int b)->{ int result=a+b;
														System.out.println("From Lambda Result is: "+result);
														return result;
														};*/

		//Case2: With Type inferencing
		// Data Type of the parameter is inferred from the Interface, as the body 
		// here is defined for the abstract method interface and
		// interface has only one abstract method, hence body and parameter data types inferred
		// from the declaration of abstract method present in the interface.
		// there by reducing Lambda as shown below:
		MathOperation mathOperation1 = (a,b)->{ int result=a+b;
														System.out.println("From Lambda Result is: "+result);
														return result;
														};
		
		int num1=10;
		int num2=30;
		executor.execute(mathOperation1, num1,num2);
	}

}
