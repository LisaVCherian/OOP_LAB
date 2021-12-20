/* Write a Java program to demonstrate the use of garbage collector */

import java.util.*;

class garbage{
	public static void main(String args[]){
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		System.out.println("Total memory: "+ r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial free memory: " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Free memory affter garbage collection: "+ mem1);
	}
}
