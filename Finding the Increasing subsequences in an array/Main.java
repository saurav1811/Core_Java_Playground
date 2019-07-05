import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    for(int index1 = 0; index1 < n; index1++)
    {
      for(int index2 = index1+1; index2 < n; index2++)
      {
        if(arr[index1] < arr[index2])
          System.out.println(arr[index1] + "," + arr[index2]);
      }
    }
  }
}