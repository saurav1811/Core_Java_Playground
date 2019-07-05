import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
           arr[index] = sc.nextInt();
       int seq[] = new int[2 * arr_size];
       int seq_idx = 0;
       int start_idx = 0;
       int sum = 0;
       int max_sum = 0;
       for(int index = 0 ; index < arr_size-1; index++)
       {
           if(arr[index] > arr[index + 1])
           {
               seq[seq_idx] = start_idx;
               seq_idx++;
               seq[seq_idx] = index;
               seq_idx++;
               start_idx = index + 1;
           }
       }
       if(start_idx != arr_size-1)
       {
               seq[seq_idx] = start_idx;
               seq_idx++;
               seq[seq_idx] = arr_size - 1;
               seq_idx++;
       }
       if(start_idx == arr_size - 1)
       {
               seq[seq_idx] = start_idx;
               seq_idx++;
               seq[seq_idx] = arr_size - 1;
               seq_idx++;
       }
       for(int index = 0; index <= (seq_idx-1); index = index + 2)
       {
           start_idx = seq[index];
           int end_idx = seq[index + 1];
           for (int idx = start_idx ; idx <= end_idx; idx++)
             sum += arr[idx];
           if(max_sum < sum)
             max_sum = sum;
           sum = 0;
       }
       System.out.println(max_sum);
   }
}