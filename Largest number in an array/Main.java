import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i<arr_size;i++)
        arr[i] = in.nextInt();
      int max = arr[0];
      for(int i=1;i<arr_size;i++)
      {
        if(arr[i] > max)
          max = arr[i];
      }
      System.out.println(max);
    }
}