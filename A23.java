/*
23. Write a Java program to convert a binary number to hexadecimal number. 
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D
*/
import java.util.*;
class Assignment1Q23
{
	public static void main(String args[])
	{
		System.out.println("Binary to HexaDecimal");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		int num = Integer.parseInt(scan.nextLine(), 2);
		
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
		
	}
}