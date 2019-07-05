import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    int idx = (str_len - 1)/2;
    for(int i = 1; i <= str_len; i++)
    {
      idx = (str_len - 1)/2;
      int t = (str_len - i);
      while(t != 0)
      {
        System.out.print(" ");
        --t;
      }
      t = i;
      while(t != 0)
      {
        System.out.print(str.charAt(idx%str_len));
        idx++;
        --t;
      }
      System.out.print("\n");
    }
  }
}