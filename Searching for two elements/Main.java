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
      int search_e1 = in.nextInt();
      int search_e2 = in.nextInt();
      int e_1_index = -1;
      int e_2_index = -1;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i] == search_e1)
          e_1_index = i;
        if(arr[i] == search_e2)
          e_2_index = i;
      }
      System.out.println(e_1_index);
      System.out.println(e_2_index);
    }
}