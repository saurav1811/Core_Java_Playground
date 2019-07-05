import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = in.nextInt();
      int sample[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        sample[i] = 0;
      for(int i=0;i<arr_size;i++)
        sample[arr[i] - 1] ++;
      int res = 0;
      for(int i=0;i<arr_size;i++)
      {
        if(sample[i] == 0)
        {
          res = i+1;
          break;
        }
      }
      System.out.println(res);
    }
}