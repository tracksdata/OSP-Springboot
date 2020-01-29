package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department dept1=ac.getBean(Department.class);
		Department dept=ac.getBean(Department.class);
		
		
		 dept1.setDeptId(11);
		 dept1.setDeptName("HR");
		  
		 dept.setDeptId(10);
		 dept.setDeptName("IT");
		 
		 
	
		
		  Employee emp=ac.getBean(Employee.class);
		  emp.setEmpId(1);
		  emp.setEmpName("Ozvitha");
		 
		  
		  emp.display();
		  

	}

}
