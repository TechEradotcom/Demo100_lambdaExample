package com.accenture.lkm.example;
interface MyInterface112{
	void service(int i, String str, double d); // should display all the details
}


interface MyInterface51 extends MyInterface112{

}

public class Tester10009 {
	
	public static void main(String[] args) {
		
		MyInterface112 my1=(i,j,k)->{System.out.println("helo");};
		
		MyInterface51 my2= (i,j,k)->{System.out.println("hello3");};
		
		
	}

}
// child of the interface is also able to handle the lambda


