package com.accenture.lkm.example;
interface MathOperation1 {
	int add(int a, int b);
}
class OperationExecutor2 {

	public void execute(MathOperation1 math, int a, int b) { // object and definition 
		int ret = math.add(a, b);
		System.out.println("final Result: "+ret);

	}

}

public class Tester10012_Lambdas_VS_Anonymuos_Class {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		int num3 = 45;

		MathOperation1 math1 = new MathOperation1() {
			@Override
			public int add(int a, int b) {
				System.out.println("address inside here..."+this);
				return (a + b) * num3;
			}
		};
		
		
		// above anonymous class as Lambda
		MathOperation1 math = (a, b)-> {
				//System.out.println("address inside here..."+this);
				return (a + b) * num3;
			};
		

		new OperationExecutor2().execute(math, 10, 20); // num3 gets replaced with literal value 45
														// by jre..
		System.out.println("Addreesss in outter: "+math);
	}

}
//Point Anonymous class is both object and definition
// where are Lambda is just definition


//Anonymous class has the capability to overwrite this reference
// where as Lambdas use the this reference from outer scope
// and cannot re-write

//Hence Lambda is not replacement of Anonymous class
