class Assignment2P9
{
	public static void main(String arags[])
	{
		for (int i = 1; i <=5 ; i++)   
		{  
			int alphabet = 64;   
			for (int j = 5; j > i; j--)  
			{  
				System.out.print(" ");  
			}  
			for (int k = 1; k <= i; k++)  
			{  
				System.out.print((char) (alphabet + k) + " ");  
			}  
		System.out.println();  
		} 
	}
}