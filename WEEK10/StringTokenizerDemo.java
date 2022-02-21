//Write a Java program that reads a line of integers and then displays each integer, and the sum of all the integers. (use String Tokenizer class of java.util)

import java.util.*;
 
class StringTokenizerDemo {
    public static void main(String args[]) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("\nEntered integers are:\n");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("\nSum of the integers is: " + sum);
        sc.close();
    }
}
