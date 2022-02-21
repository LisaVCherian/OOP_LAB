//Write a file handling program in java with reader/writer

import java.io.*;
class Main{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileWriter fw = new FileWriter("output.txt");
		String str = "Writing to a file";
		for(i = 0; i<str.length(); i++)
			fw.write(str.charAt(i));
		System.out.println("Writing successful!");
		fw.close();
		
		FileReader fr = new FileReader("output.txt");
		while((i=fr.read()) != -1)
			System.out.println((char)i);
		fr.close();
		}
}
