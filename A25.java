/*
25. Write a Java program to convert a octal number to a decimal number. 
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8
*/

import java.util.*;                               
public class Assignment1Q25 {

    public static void main(String[] args) {
		System.out.print("Enter no is Octal :");
         Scanner sc =new Scanner(System.in);
		 int decimal=sc.nextInt();
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}