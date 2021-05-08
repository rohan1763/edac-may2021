/*
21. Write a Java program to convert a decimal number to octal number. 
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17 
*/

import java.util.*;
class Assignment1Q21
{
public static void main(String args[])
{
	System.out.print("Enter value :");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	System.out.println(Integer.toOctalString(number));
}
}
