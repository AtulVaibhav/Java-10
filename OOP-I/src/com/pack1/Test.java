package com.pack1;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.empId);
		System.out.println(emp.companyName);
		//System.out.println(emp.empAccnt);
		System.out.println(emp.sysPass);
		
		Child ch = new Child();
		System.out.println(ch.sysPass);
        
	}

}
/**
default : within same package we can access anywhere
          outside package ,not allowed
public  : within same package we can access anywhere
          outside package ,allowed
private : within same package,we can't access.We can access within same class.
          outside package, not allowed.
protected :within same package, parent class as well as child can access protected data.
           outside package, not allowed
*/