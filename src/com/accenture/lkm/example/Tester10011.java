package com.accenture.lkm.example;
interface Asset1 {
	void useAsset1(int employee, String eployeeNAme);
}
class Employee11 {
	private int employeeId;
	private String employeeName;
	public Employee11(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployee11Id() {
		return employeeId;
	}

	public void setEmployee11Id(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployee11Name() {
		return employeeName;
	}

	public void setEmployee11Name(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void employeeUsingAsset1(Asset1 asset){
		//4545
		asset.useAsset1(this.employeeId, employeeName);
	}

}

public class Tester10011 {
	public static void main(String[] args) {
		
		Employee11 emp1 = new Employee11(10001, "Jack");//4545
		
		Employee11 emp2 = new Employee11(10002, "Austin");//6565
		
	
		emp1.employeeUsingAsset1((empID,empNAme)->System.out.println("Employee11ID: "+empID+", Employee11Name: "+ empNAme+" using asset"));
		//4545-->this
		
		emp2.employeeUsingAsset1((empID,empNAme)->System.out.println("Employee11Name: "+ empNAme+" using asset"));
		//6565->this
	}

}
//Lambdas use the same "this reference" as present in 
//outer/containing/called method

// here inline Lambdas are Shown

