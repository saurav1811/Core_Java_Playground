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
       int res_arr[] = new int[arr_size];
       int j = 0;
       for(int i=0;i<arr_size;i++)
       {
         if(arr[i] != 0)
         {
           res_arr[j] = arr[i];
           j++;
         }
       }
      for(int i=0;i<arr_size;i++)
        System.out.print(res_arr[i] + " ");
    }
}