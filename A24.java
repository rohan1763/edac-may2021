/*
24. Write a Java program to convert a binary number to a Octal number. 
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7
*/

import java.util.*;
class Assignment1Q24
{
	public static void main(String args[])
	{
		System.out.println("Binary to Octal");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		int num = Integer.parseInt(scan.nextLine(), 2);
		
		 String octal = Integer.toOctalString(num);
		System.out.println("Octal Conversion :"+octal);
	}
}
		