/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/
public class Assignment2P7 {
    public static void main(String[] args) {
      int i = 5;
      int count=0;
      for(int col=1;col<6;col++)
      {
        for(int row=1;row<10;row++)
        {
          if(i==row)
          {
            count = 1; 
            System.out.print(count);
            i = i-1;
          }
          else if(count!=col)
          {
            if(row == (i+3)  || row == (i+5) || row == (i+7) || row == (i+9) )
            {
                count = count+1;
                System.out.print(count);
            }
            else
            {
                System.out.print(" ");
            }
          }
          else
          {
            System.out.print(" ");
          }
        } 
        System.out.println("");
      }
    }
}