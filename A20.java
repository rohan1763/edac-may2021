/*
20. Write a Java program to convert a decimal number to hexadecimal number. 
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F
*/

import java.util.*;
class Assignment1Q20
{
public static void main(String args[])
{
	System.out.print("Enter value :");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	String hexNum=Integer.toHexString(number);
	System.out.println("HexaDecimal Conversion :"+hexNum); 
}
}

/*
Output
Enter value : 15
HexaDecimal Conversion :f
*/