package com.accenture.lkm.example;

class Employee3{
	
	static public void printDetails(int employeeId,String employeeName,double salary){
		System.out.println("Employee3");
		System.out.println("-------");
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
}

class Customer3{
	
	static public void printDetails(int customerId,String customerName,double bill){
		System.out.println("Customer");
		System.out.println("-------");
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(bill);
	}
}
class Shoe2{
	
	public void printDetails(int shoe){
		System.out.println("Customer");
		System.out.println(shoe);
	}
}
interface HolderITF1{
	void foolDummy(int employeeId,String employeeName,double salary);
}
interface HolderShoe2ITF2{
	void forShoe2(int num);
}
public class Tester10014 {
	public static void main(String[] args) {
		//HolderITF1 hold1 = new Employee3():: printDetails;
		//HolderITF1 hold2 = new Customer3():: printDetails;
		
		HolderITF1 hold1 = Employee3:: printDetails;
		HolderITF1 hold2 = Customer3:: printDetails;
		
		//invocation
		hold1.foolDummy(10001, "Jack", 1234);
		hold2.foolDummy(10002, "CustomerJack", 2234);
		//means the foolDummy method will actual invoke 
		// under lying actual method being  reffered
		
		//HolderITF1 hold1 = Employee3:: printDetails;
		// when ever method is invoked,
		//LHS will give signature to RHS, and RHS will give body back to LHS 
		// to execute for an invocation
		
		
		
	}

}
//Method Reference Signature for static method:
// Containingclass::methodName

//References store values/ think of References storing
//methods/ not return values but methods
//so methods can be executed by using the reference