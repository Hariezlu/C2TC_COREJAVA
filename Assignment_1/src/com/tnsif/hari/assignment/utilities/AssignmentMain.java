package com.tnsif.hari.assignment.utilities;
import com.tnsif.hari.assignment.employees.*;
import com.tnsif.hari.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Alice", 101, 95000.0, "IT");
        Developer developer = new Developer("Bob", 102, 85000.0, "Java");

        // Print details using EmployeeUtilities
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
	}

}
