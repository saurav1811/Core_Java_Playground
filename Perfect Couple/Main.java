import java.util.Scanner;
class Main
{
    public static void check_pair_val(int arr[],int size,int value)
    {
      int sum = 0;
      for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
        {
          sum += arr[i] + arr[j];
          if(sum == value)
            System.out.println(arr[i] + ", " + arr[j]);
          sum = 0;
        }
      }
    }
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = in.nextInt();
      int value = in.nextInt();
      check_pair_val(arr,arr_size,value);
    }
}