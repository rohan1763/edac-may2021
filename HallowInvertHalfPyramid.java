/*
******
*   *
*  *
* *
**
*
*/

class HallowInvertHalfPyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1 & j==1 | i==1 & j==2 | i==1 & j==3 | i==1 & j==4 |  i==1 & j==5 | i==1 & j==6)
				{
					System.out.print("*");
				}
				else if(i==1 & j==1 | i==2 & j==1 | i==3 & j==1 | i==4 & j==1 |  i==5 & j==1 | i==6 & j==1)
				{
					System.out.print("*");
				}
				else if(i==6 & j==1 | i==5 & j==2|i==4 & j==3 ||i==3 & j==4 |i==2 & j==5 |i==1 & j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}					