package com.accenture.lkm.example;

public class Tester10002 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();
		
		MathOperation mathOperation1 = new MathOperation() {
			@Override
			public Integer add(int a, int b) {
				int result=a+b;
				System.out.println("Math Operation1: Result Inside the method is: "+result);
				return result;
			}
		};
		
		MathOperation mathOperation2 = new MathOperation() {
			@Override
			public Integer add(int a, int b) {
				int result=a+b;
				System.out.println("Math Operation2: Result Inside the method is: "+result);
				return result;
			}
		};
		
		
		int num1=10;
		int num2=30;
		executor.execute(mathOperation1, num1,num2);
		executor.execute(mathOperation2, num1,num2);
	}

}
// 2 operations passed at line 28 and 27