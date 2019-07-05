import java.util.Scanner;
class Main
{
    public static int Power_Num(int a,int b)
    {
      int prod = 1;
      for(int i=1;i<=b;i++)
        prod *= a;
      return prod;
    }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int res = Power_Num(base,exp);
      System.out.print(res);
	}
}