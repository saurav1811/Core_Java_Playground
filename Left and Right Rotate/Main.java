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
       int no_of_rotation = in.nextInt();
       int odd[] = new int[arr_size];
       int even[] = new int[arr_size];
       int odd_index = 0, even_index = 0;
       for(int i=0;i<arr_size;i++)
       {
         // odd position elements
         if(i%2 == 0)
         {
           odd[odd_index] = arr[i];
           odd_index++;
         }
         // even position elements
         else
         {
           even[even_index] = arr[i];
           even_index++;
         }
       }
       int temp_odd, temp_even;
       for(int j=0;j<no_of_rotation;j++)
       {
         // circular right rotate
         temp_odd = odd[odd_index-1];
         for(int i=odd_index-2;i>=0;i--)
           odd[i+1] = odd[i];
         odd[0] = temp_odd;
         
         // circular left rotate
         temp_even = even[0];
         for(int i=1;i<even_index;i++)
           even[i-1] = even[i];
         even[even_index-1] = temp_even;
       }
       odd_index = 0;
       even_index = 0;
       for(int i=0;i<arr_size;i++)
       {
         if(i%2 == 0)
         {
           System.out.print(odd[odd_index] + " ");
           odd_index++;
         }
         else
         {
           System.out.print(even[even_index] + " ");
           even_index++;
         }
       }
  	}
}