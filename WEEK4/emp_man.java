/* Write a Java program to which creates a class named "Employee" having the following members: Name, Age, Phone number, Address, Salary. 
It also has a method named 'printSalary()' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' classes have data members 'specialization' 
and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes 
and print the same. */


class Employee {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Officer extends Employee{
    String specialization;

    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee{
	String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class emp_man{
    public static void main(String[] args) {
    Officer o = new Officer("Olly", 25, "9680174683", "Home", 50000, "IT");
    Manager m = new Manager("Vivian", 23, "7089684756", "Earth", 65000, "HR");

	System.out.println("\nOfficer Details:");
	System.out.println("Name: "+o.name);
	System.out.println("Age: "+o.age);
	System.out.println("Phone Number: "+o.phoneNumber);
	System.out.println("Address: "+o.address);
	System.out.println("Specialization: "+o.specialization);
	o.printSalary();

	System.out.println("\nManager Details:");
	System.out.println("Name: "+m.name);
	System.out.println("Age: "+m.age);
	System.out.println("Phone Number: "+m.phoneNumber);
	System.out.println("Address: "+m.address);
	System.out.println("Department: "+m.department);
	m.printSalary();
    }
}
