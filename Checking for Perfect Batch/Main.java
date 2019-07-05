import java.util.Scanner;
class Main
{
  public static void batch_3_sum_check(int list[],int n)
  {
    int size = n/3;
    int sums[] = new int[size];
    int j=0;
    for(int i=0;i<n;i++)
    {
      sums[j] += list[i];
      if(i%3 == 2)
        j++;
    }
    int num = sums[0];
    boolean is_matched = true;
    for(j=1;j<size;j++)
    {
      if(sums[j] != num)
        is_matched = false;
    }
    if(is_matched == true)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
      list[i] = in.nextInt();
    batch_3_sum_check(list,n);
  }
}