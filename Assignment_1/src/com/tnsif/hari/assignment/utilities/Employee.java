package com.tnsif.hari.assignment.utilities;
import com.tnsif.hari.assignment.employees.Employee;

public class Employee {

	public static void printEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
	}

}
