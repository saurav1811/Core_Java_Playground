import java.util.Scanner;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    double d = 0;
    int flag = 0;
    double m = 1;
    for(int i=0;i < str.length();i++)
    {
      if(flag == 0)
      {
       if(str.charAt(i) == '.')
       {
         flag = 1;
         continue;
       }
       int n = str.charAt(i) - '0';
       d = d*10 + n;
      }
      else
      {
        double mx = (double)(str.charAt(i) - '0')/Math.pow(10.0, m);
        d = d + mx;
        m++;
      }
    }
    System.out.printf("%.6f",d);
  }
}