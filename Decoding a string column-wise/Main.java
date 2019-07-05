import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int col_count = in.nextInt();
    StringBuilder sb = new StringBuilder(str);
    delete_spaces(sb, sb.length());
    int sb_len = sb.length();
    int row_count = sb_len/col_count;
    int temp = sb_len;
    if(sb_len%col_count > 0)
      row_count++;
    while(temp%col_count != 0)
    {
      sb.append('X');
      sb_len++;
      temp++;
    }
    for(int col_idx = 0; col_idx < col_count; col_idx++)
   {
       for(int row_idx = 0; row_idx < row_count; row_idx++)
       {
         int curr_char_idx = col_idx + (row_idx * col_count);
         if(row_idx % 2 == 1)
         {
            int char_idx = (col_count - 1) + (row_idx * col_count);
            curr_char_idx = char_idx - col_idx;
         }
         if(curr_char_idx < sb_len)
             System.out.print(sb.charAt(curr_char_idx));
       }
    }
  }
 public static void delete_spaces(StringBuilder str, int str_len)
 {
   StringBuilder temp = new StringBuilder("");
   for(int i = 0; i < str_len; i++)
   {
       if(str.charAt(i) != ' ')
       {
           temp.append(str.charAt(i));
       }
   }
   str.setLength(0);
   int temp_len = temp.length();
   for(int i = 0; i < temp_len; i++)
   {
       str.append(temp.charAt(i));     
   }
 }
}