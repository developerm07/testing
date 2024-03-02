package com.manu.practice;

public class MemoryManagement {

	public static void main(String[] args) {
		int a=10;
		/*getValue(a);
		System.out.println("Value is "+a);
		*/
		
		Employee emp = new Employee("Manohar");

		System.out.println("Before employee Name is ==> "+emp.getEmpName());
		getName(emp);
		System.out.println(emp.getEmpName());
		
	}

	private static void getName(Employee emp) {
		// TODO Auto-generated method stub
		emp.setEmpName("Manu");
		//return emp;
		
	}

	public static void getValue(int a) {
		// TODO Auto-generated method stub
		a=11;
		
	}
	
}
