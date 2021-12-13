import java.util.Scanner;

class usrInput{
	public static void main(String args[]){
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter name, age, salary:");
		String name = inputObj.nextLine();
		int age = inputObj.nextInt();
		double salary = inputObj.nextDouble();

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}
