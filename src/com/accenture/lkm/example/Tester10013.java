package com.accenture.lkm.example;
class Employee2{
	
	public void printDetails(int employeeId,String employeeName,double salary){
		System.out.println("Employee2");
		System.out.println("-------");
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
}

class Customer2{
	
	public void printDetails(int customerId,String customerName,double bill){
		System.out.println("Customer");
		System.out.println("-------");
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(bill);
	}
}
class Shoe{
	
	public void printDetails(int shoe){
		System.out.println("Customer");
		System.out.println(shoe);
	}
}
interface HolderITF{
	void foolDummy(int employeeId,String employeeName,double salary);
}
interface HolderShoeITF{
	void forShoe(int num);
}
public class Tester10013 {
	public static void main(String[] args) {
		HolderITF hold1 = new Employee2():: printDetails; // refer instance method
		HolderITF hold2 = new Customer2():: printDetails; //refer instance , 
		HolderShoeITF hold3 = new Shoe():: printDetails;  // refer instance
		
		//vs:
		// check error by uncommenting the below Line
		//HolderITF hold4 = new Shoe():: printDetails;
		
		System.out.println("--done---");
		
		// invocation
		
		hold1.foolDummy(12,"MSD",90);
		
		System.out.println("\n");
		hold2.foolDummy(1200,"Test",10);
		
	}

}
// Method Reference Signature for instance method:
// new Containingclass()::methodName


//method reference are used for concrete method
// only functional interface can store the method reference 


// References store values/ think of References storing
// methods/ not return values but methods
// so methods can be executed by using the reference