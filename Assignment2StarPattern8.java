/*
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
  */
  
class Assignment2StarPattern8
{
	public static void main(String args[])
	{
		//Upper-R
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Lower-R
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
		
		 