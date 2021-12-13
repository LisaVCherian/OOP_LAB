//Write a Java program to find the frequency of given character in a string

import java.util.*;

class Frequency{
	public static void main(String args[]){
	String s; char c; int ans=0;

	System.out.println("Enter the string:");
	Scanner scn = new Scanner(System.in);
	s = scn.nextLine(); 
	System.out.println("Enter the character:");
	c = scn.next().charAt(0);
	for(int i =0; i<s.length();i++){
		if(s.charAt(i)==c){ans++;}
	}
	System.out.println("The frequency is:"+ans);

	}
}
