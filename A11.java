import java.util.*;
class A11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a radius:");
		double r=sc.nextDouble();
		double A;
		double P;
		A=3.14*r*r;
		P=2*3.14*r;
		System.out.println("A:"+A);
		System.out.println("p:"+P);
	}
}