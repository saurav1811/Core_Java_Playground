import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1;row_num <= n;row_num++)
      {
        for(int col_num = n-(row_num - 1);col_num>0;col_num--)
          System.out.print(col_num);
        System.out.print("\n");
      }
	}
}