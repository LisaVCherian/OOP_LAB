/*Write two java classes Employer and Engineer. Engineer should inherit from Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation.(ie. only one object creation allowed)
-> display() only prints the name of the class and doe snot return any value. Ex. "Name of class in Employee"
-> calcSalary() in Employee displays "salary of employee is 10000" and calcSalary() in Engineer displays "Salary of employee is 20000" */

import java.io.*;
import java.util.*;

class Employee{
	int salary = 10000;
	void display(){
		System.out.println("Name of class is Employee");
	}
	void calcSalary(){
		System.out.println("Salary of Employee is "+salary);
	}
}

class Engineer extends Employee{
	int salary = 20000;
	void calcSalary(){
		System.out.println("Salary of Engineer is "+salary);
		super.calcSalary();
	}
}

public class practice{
    public static void main(String args[]) {
	Engineer e = new Engineer();
	e.display();
	e.calcSalary();
	}
}
