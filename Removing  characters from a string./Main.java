import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();
    StringBuilder sb = new StringBuilder(sentence);
    String check = in.nextLine();
    StringBuilder result = new StringBuilder("");
    int sen_len = sb.length();
    int check_len = check.length();
    for(int i = 0; i < check_len; i++)
    {
      for(int j = 0; j < sen_len; j++)
      {
        if(check.charAt(i) == sb.charAt(j))
          sb.setCharAt(j,'$');
      }
    }
    for(int i = 0; i < sen_len; i++)
    {
      if(sb.charAt(i) == '$')
        continue;
      result.append(sb.charAt(i));
    }
    System.out.println(result);
  }
}