import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      int N = 2;
      for(int row_num = 1;row_num <= n;row_num++)
      {
        for(int col_num = 1;col_num <= n;col_num++)
        {
          if(row_num%2 == 1)
          {
            if(col_num != n)
            	System.out.print(num);
            else
            {
              System.out.print(N);
            }
          }
          else
          {
            if(col_num == 1)
            	System.out.print(N);
            else
            {
              System.out.print(num);
            }
          }
        }
        N = N+1;
        num = num +1;
        System.out.print("\n");
      }
	}
}