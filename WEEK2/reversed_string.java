// Write a Java program to reverse a given string

import java.io.*;
import java.util.*;
class reversed_string{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	String initial, rev="";

	System.out.print("\nEnter a string: "); 
	initial = sc.nextLine();

	int length = initial.length();

	for(int i = length-1; i>=0; i--)
		rev=rev+initial.charAt(i);

	System.out.println("Reversed string: "+rev); 
	}
}
