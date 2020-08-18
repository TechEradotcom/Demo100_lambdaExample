package com.accenture.lkm.example;

public class Tester10004 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();
		
		//for a paramterList execute the body after the arrow:
		MathOperation mathOperation1 = (int a, int b)->{ int result=a+b;
														System.out.println("From Lambda Result is: "+result);
														return result;
														};

		
		int num1=10;
		int num2=30;
		executor.execute(mathOperation1, num1,num2);
	}

}
// an interface which has jut one method abstract is called as functional interface
// where as this interface can have n number of non abstract methods 
//[Note:(since java 8 interfaces can have non abstract methods with default and static specifier)]
// every funcational interface works as place holder for Lambda
// Lambda makes it possible to have a function definition exist without object creation
// hence using Lambdas it is possible to create pure closure as show above

