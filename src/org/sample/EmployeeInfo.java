package org.sample;

public class EmployeeInfo {
	
	private void empId() {
    System.out.println("employee id is = 26787");
	}
    private void empName() {
    System.out.println("employee name is = Harish");
}
public static void main(String[] args) {

	//ClassName objectName = new className();
	 EmployeeInfo o = new EmployeeInfo();
	 //objectName.methodName();
	 o.empId();
	 o.empName();
	 
	 //ClassName objectName = new ClassName();
	 CompanyInfo c = new CompanyInfo();
	 //objectName.methodName();
	c.compid();
	c.compName();	 
	 
	
}
}
