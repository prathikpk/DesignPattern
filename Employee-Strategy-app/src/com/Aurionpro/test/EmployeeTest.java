package com.Aurionpro.test;

import com.Aurionpro.model.Consultant;
import com.Aurionpro.model.Employee;
import com.Aurionpro.model.SeniorConsultant;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sachin", new Consultant());
		System.out.println(emp);
		System.out.println("------------------------------");
		emp.promote(new SeniorConsultant());
		System.out.println("Promoted:");
		System.out.println(emp);
		System.out.println(emp.description());
		System.out.println(emp.responsibility());

	}

}
