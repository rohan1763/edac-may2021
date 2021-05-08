class Assignment2P6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{ 
		   for(int k=4;k>=i;k--)//for spacing
		   {
              System.out.print("  ");
           }
           for(int j=1;j<=i;j++)
           {
              System.out.print(" *"); 
           }
          System.out.println();
        }
	}
}
