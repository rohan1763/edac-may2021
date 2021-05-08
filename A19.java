/*
19. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected OutputBinary number is: 101 
*/

import java.util.*;
class Assignment1Q19
{
public static void main(String args[])
{
System.out.print("Enter value :");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int digit=0;
while(number>0)
{
	digit=number%2;
	number=number/2;
	System.out.print(""+digit);
}

//System.out.println(Integer.toBinaryString(number));
}
}

