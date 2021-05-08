/*
22. Write a Java program to convert a binary number to decimal number. 
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4 
*/
class Assignment1Q22 {
    
  public static void main(String[] args) {
    long num = 110110111;
    int decimal = convertBinaryToDecimal(num);
    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}