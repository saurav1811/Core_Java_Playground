import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = scan.nextInt();
      int k = scan.nextInt();
      int res = arr[0], r = 0,start_idx = 0,max_idx = 0;
      while(r<k)
      {
        max_idx = 0;
        if(arr[start_idx] > arr[start_idx + 1])
         max_idx = start_idx;
        else
         max_idx = start_idx + 1;
        for(int i = start_idx + 2; i < n; i++)
        {
         if(arr[max_idx] < arr[i])
          max_idx = i;
        }
        int temp = arr[start_idx];
        arr[start_idx] = arr[max_idx];
        arr[max_idx] = temp;
        start_idx++;
        r++;
      }
      System.out.println(arr[start_idx - 1]);
    }   
}