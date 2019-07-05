import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for(int row_num = 1;row_num<=n;row_num++)
      {
        for(int space_row = 1;space_row <= n-row_num;space_row++)
          System.out.print(" ");
        for(int num_row = 1;num_row <= row_num;num_row++)
        {
          System.out.print(num + " ");
          num = num + 1;
        }
        System.out.print("\n");
      }
    }    
}