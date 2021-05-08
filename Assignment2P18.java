/*
A B C D E
A B C D
A B C
A B
A
*/
class Assignment2P18
{
	public static void main(String args[])
	{
		int alpha=64;
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+k)+" ");
			}
			System.out.println();
		}
	}
}
