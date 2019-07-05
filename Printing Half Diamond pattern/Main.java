import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1;row_num <=n;row_num++)
      {
        for(int space_row = 1;space_row <= n-row_num;space_row++)
          System.out.print(" ");
        for(int star_row = 1;star_row <= 2*row_num-1;star_row++)
          System.out.print("*");
        System.out.print("\n");
      }
	}
}