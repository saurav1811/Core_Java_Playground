import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder("");
      int str_len = str.length();
      for(int i=(str_len-1);i>=0;i--)
      {
        sb.append(str.charAt(i));
      }
      reverse_string(sb,0,str_len-1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      StringBuilder temp = new StringBuilder("");
      for(int i=start_idx;i<=end_idx;i++)
      {
        if(sb.charAt(i) != ' ')
        temp.append(sb.charAt(i));
        else
        {
          int temp_len = temp.length();
          int front = 0;
          int end = temp_len - 1;
          while(front < end)
          {
            char ch = temp.charAt(front);
            temp.setCharAt(front,temp.charAt(end));
            temp.setCharAt(end,ch);
            front++;
            end--;
          }
          int j = i-temp_len;
          int temp_index = 0;
          while(j<i)
          {
            sb.setCharAt(j,temp.charAt(temp_index));
            j++;
            temp_index++;
          }
          temp.setLength(0);
        }
      }
      
      int temp_len = temp.length();
      int front = 0;
      int end = temp_len - 1;
      while(front < end)
      {
         char ch = temp.charAt(front);
         temp.setCharAt(front,temp.charAt(end));
         temp.setCharAt(end,ch);
         front++;
         end--;
       }
       int j = sb.length()-temp_len;
       int temp_index = 0;
       while(j<sb.length())
       {
         sb.setCharAt(j,temp.charAt(temp_index));
         j++;
         temp_index++;
       }
       System.out.println(sb);
    }
}