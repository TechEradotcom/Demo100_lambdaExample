package com.accenture.lkm.example;
interface Asset {
	void useAsset(int employee, String eployeeNAme);
}
class Employee {
	private int employeeId;
	private String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void employeeUsingAsset(Asset asset){
		//4545
		asset.useAsset(this.employeeId, employeeName);
	}
	
	
	public void printDetails(){
		System.out.println("FRom here");
		System.out.println(employeeId+","+this.employeeName);
											///4545.employeeName
	}

}

public class Tester10010 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10001, "Jack");//4545
		//4545
		
		
		Employee emp2 = new Employee(10002, "Austin");//6565
		//6565
		
		emp1.printDetails();
		// 4545--->this
		// this is passed implicitly/automatically
		emp2.printDetails();
		// 6565--->this
		// this is passed implicitly/automtically
		
		
		Asset asset = (empID,empNAme)->System.out.println
				("EmployeeID: "+empID+", EmployeeName: "+ empNAme+" using asset");
		
		emp1.employeeUsingAsset(asset);
		//4545-->this
		
		emp2.employeeUsingAsset(asset);
		//6565->this
		
	
	}

}
//Lambdas use the same "this reference" as present in 
//outer/containing/called method


