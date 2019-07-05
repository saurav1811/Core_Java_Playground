import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int count = 0;
    int str1_len = str1.length();
    int str2_len = str2.length();
    for(int i=0;i<(str1_len - str2_len + 1);i++)
    {
      boolean is_found = true;
      for(int j=0;j<str2_len;j++)
      {
        if(str1.charAt(i+j) != str2.charAt(j))
          is_found = false;
      }
      if(is_found == true)
        count++;
    }
    System.out.println(count);
  } 
}