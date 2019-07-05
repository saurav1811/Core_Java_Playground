import java.util.Scanner;
public class Main
{
    public static int gcd(int n1, int n2)
    {
      int min;
      if(n1 > n2)
        min = n2;
      else
        min = n1;
      while(min >= 1)
      {
        if(n1%min == 0 && n2%min == 0)
          break;
        min = min - 1;
      }
      return min;
    }
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int res1 = gcd(n1,n2);
      int res = gcd(res1,n3);
      System.out.print(res);
	}
}