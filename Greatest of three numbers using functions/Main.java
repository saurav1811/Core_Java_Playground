import java.util.Scanner;
class Main
{
    public static int comp_two_num(int n1, int n2)
    {
      int res;
      if(n1 > n2)
        res = n1;
      else
        res = n2;
      return res;
    }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int res1 = comp_two_num(n1,n2);
      int res = comp_two_num(res1,n3);
      System.out.print(res);
	}
}