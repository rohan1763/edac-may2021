import java.util.*;
class A6
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter a two numbers:");
		int i=SC.nextInt();
		int j=SC.nextInt();
		int add=i+j;
		int substract=i-j;
		int multiply=i*j;
		int divison=i/j;
		int modulus=i%j;
		System.out.println("add:"+add);
		System.out.println("substract:"+substract);
		System.out.println("multiply:"+multiply);
		System.out.println("divison:"+divison);
		System.out.println("modulus:"+modulus);
	}
}