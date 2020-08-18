package com.accenture.lkm.example;

public class Tester10007 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();

		//Case2: With Type inferencing
		// Data Type of the parameter is inferred from the Interface, as the body 
		// here is defined for the abstract method interface and
		// interface has only one abstract method, hence body and parameter data types inferred
		// from the declaration of abstract method present in the interface.
		// there by reducing Lambda as shown below:
		/*MathOperation mathOperation1 = (a,b)->{ int result=a+b;
														System.out.println("From Lambda Result is: "+result);
														return result;
														};
		*/
														
		// if after "->" there is only one statement then usage of {} is not mandatory 
		// and return type and data is also inferred from abstract methods signature there by
		// leaving the Lambda reduced to a small line as shown below:
		//MathOperation mathOperation1 = (a,b)->a+b;
												
														
		int num1=10;
		int num2=30;
		
		executor.execute(
						(a,b)->a+b, 
						num1,
						num2); //InLine Lambda
	}

}
