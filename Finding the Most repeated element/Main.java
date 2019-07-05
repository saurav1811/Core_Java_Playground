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
    int unique_arr[] = new int[arr_size];
    int idx = 0;
    int count = 1;
    int repetitions[] = new int[arr_size];
    for(int i = 0;i < arr_size-1;i++)
    {
      if(arr[i] == -1)
        continue;
      for(int j = i+1;j < arr_size;j++)
      {
        if(arr[i] == arr[j])
        {
          count++;
          arr[j] = -1;
        }
      }
      unique_arr[idx] = arr[i];
      repetitions[idx] = count;
      idx++;
      count = 1;
    }
    int maxnum = repetitions[0];
    int idx1 = 0;
    for(int i = 1; i < idx; i++)
    {
      if(maxnum < repetitions[i])
      {
        maxnum = repetitions[i];
        idx1 = i;
      }
    }
    System.out.println(unique_arr[idx1]);
  }
}