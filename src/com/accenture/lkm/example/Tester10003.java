package com.accenture.lkm.example;

public class Tester10003 {
	public static void main(String[] args) {
		OpertionExecutor executor = new  OpertionExecutor();
		
		int numSp=34;
		//Uncomment below line and check the error
		//numSp=13;
		MathOperation mathOperation1 = new MathOperation() {
			@Override
			public Integer add(int a, int b) {
				int result=a+b*numSp;
				System.out.println("Math Operation1: Result Inside the method is: "+result);
				return result;
			}
		};

		
		int num1=10;
		int num2=30;
		executor.execute(mathOperation1, num1,num2);
	}

}
// if method is executed inside the executor what happens to numSp.
// it local variable of main, how executor is able to access it







//it is because JRE before sending the object and method definition to executor at Line 22
// will covert the numSp to it literal value 34 and then send
// in order to make this conversion of variable to its literal value
// numSp should be declared with final keyword in java7, int numSp=34;
// where as in java8 it is optional but variable becomes effectively final
// try un-commenting the Line: and check the error at Line 13
