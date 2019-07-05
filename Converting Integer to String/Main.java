import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = 0;
    if(n < 0)
      m = n-2*n;
    else
      m = n;
    int temp = m;
    int count = 0;
    while(temp > 0)
    {
        count++;
        temp = temp/10;
    }
    StringBuilder sb = new StringBuilder("");
    while(m > 0)
    {
      char ch = (char)((m % 10) + '0');
      sb.append(ch);
      m /= 10;
      --count;   
    }
    if(n < 0)
      sb.append('-');
    sb.reverse();
    System.out.println(sb);
  }
}