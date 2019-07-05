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
      int start = 0;
      int end = (arr_size - 1);
      int is_not_palindrome = 0;
      while(start < end)
      {
        if(arr[start] != arr[end])
        {
          is_not_palindrome = 1;
          break;
        }
        start++;
        end--;
      }
      if(is_not_palindrome == 1)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}