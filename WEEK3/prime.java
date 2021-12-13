//Write a Java program to check whether a given number is prime or not

import java.util.*;
class prime{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int n, m, flag=0;
	System.out.print("\nEnter a number: ");
	n = sc.nextInt();
	m=n/2;

	if(m==0 || m==1)
	{
		System.out.println(n + " is not a prime number\n");
		flag = 1;
	}
	else
	{
		for(int i = 2; i<m; i++)
		{
			if(n%i == 0)
			{
				System.out.println(n + " is not a prime number\n");
				flag = 1; 
				break;
			}
		}

	}

	if(flag==0)
		System.out.println(n + " is a prime number\n");

	}
}
