//Write a JAVA program that checks whether a given string is a palindrome or not

import java.util.*;
class palindrome{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter the text: ");
	String text = sc.nextLine();

	String txt = text.toLowerCase();

	int len = txt.length();
	String rev = "";

	for(int i=len-1;i>=0;i--)
		rev = rev + txt.charAt(i);

	if(txt.equals(rev))
		System.out.println("\nIs Palindrome\n");
	else
		System.out.println("\nNot Palindrome\n");
	
	}
}
