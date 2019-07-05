import java.util.Scanner;
class Main
{
    public static int square(int n)
    {
      int sq = n*n;
      return sq;
    }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sqr = square(n);
      System.out.print(sqr);
	} 
}