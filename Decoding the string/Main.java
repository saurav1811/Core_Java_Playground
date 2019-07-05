import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    int str_len = str.length();
    StringBuilder res = new StringBuilder("");
    for(int i = 0; i < str_len; i++)
    {
      if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
      {
        int offset = str.charAt(i) - 'A';
        char ch = (char) (((offset + 26 - key) % 26) + 'A');
        res.append(ch);
      }
      else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
      {
        int offset = str.charAt(i) - 'a';
        char ch = (char) (((offset + 26 - key) % 26) + 'a');
        res.append(ch);
      }
      else
        res.append(str.charAt(i));
    }
    System.out.println(res);
  }
}