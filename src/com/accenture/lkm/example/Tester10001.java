package com.accenture.lkm.example;

public class Tester10001 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();
		
		MathOperation mathOperation = new MathOperation() {
			@Override
			public Integer add(int a, int b) {
				int result=a+b;
				System.out.println("Result Inside the method is: "+result);
				return result;
			}
		};
		
		// where the method execution is happening ??
		// at Line 7 or inside the executor class
		int num1=10;
		int num2=30;
		executor.execute(mathOperation, num1,num2);
		
	}

}
// Closure also as Line 20 by passing mathOperation 2 things are passed:
//Object and method definition

//a method that receives the other methods definition 
//as parameter is called as closure
