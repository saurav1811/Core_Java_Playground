import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1;row_num<=n;row_num++)
      {
        for(int col_num = 1;col_num<=n;col_num++)
        {
          if(col_num == row_num)
            System.out.print("*");
          else if(col_num == n - (row_num - 1))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}