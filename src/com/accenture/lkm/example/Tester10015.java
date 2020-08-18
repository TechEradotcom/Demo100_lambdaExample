package com.accenture.lkm.example;

class Employee5{
	static public void printDetails(int employeeId,String employeeName,double salary){
		System.out.println("Employee5");
		System.out.println("-------");
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
}
class Customer5{	
	static public void printDetails(int custoermId,String customerName,double bill){
		System.out.println("Customer");
		System.out.println("-------");
		System.out.println(custoermId);
		System.out.println(customerName);
		System.out.println(bill);
	}
}

interface HolderITF1445{
	void printDetails(int employeeId,String employeeName,double salary);
}
public class Tester10015 {
	public static void main(String[] args) {
	
		HolderITF1445 hold1 = Employee5:: printDetails;
		
		HolderITF1445 hold2 = Customer5:: printDetails;
		
		
		hold1.printDetails(123,"Test", 45);
		
		
		
		
	}

}
//To Avoid confusion
// functional iterface's abstract method
// should have the same name as that of the the method being referenced
