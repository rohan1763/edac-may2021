/*
                         9
                      8 9 8
                   7 8 9 8 7
                6 7 8 9 8 7 6
            5 6 7 8 9 8 7 6 5
         4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
   2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/
import java.util.*;
class PayramidPatternP5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		for (int i = rows; i >= 1; i--)   
		{  
			for (int j = 1; j < i; j++)   
			{  
				System.out.print("  ");  
			}  
			for (int j = i; j <= rows; j++)  
			{  
				System.out.print(j+" ");  
			}  
			for(int k=rows-1;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();  
		}  
	} 
}
//pending cl