import java.util.*;
class A15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int temp;
	
		temp=i;
		i=j;
		j=temp;
		System.out.println("after swapping:"+i);
		System.out.println("after swapping:"+j);
	}
}
		
		
		