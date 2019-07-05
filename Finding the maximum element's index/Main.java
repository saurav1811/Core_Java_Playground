import java.util.Scanner;
class Main
{
  public static void max_el_index(int list[],int n)
  {
    int max = list[0];
    int ind = 0;
    for(int i=1;i<n;i++)
    {
      if(list[i] > max)
      {
        max = list[i];
        ind = i;
      }
    }
    System.out.print(ind);
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
      list[i] = in.nextInt();
    max_el_index(list,n);
  }
}