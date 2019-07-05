import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      String s2 = s1.toLowerCase();
      int stat[] = new int[26];
      for(int i=0;i<26;i++)
        stat[i] = 0;
      for(int i=0;i<s2.length();i++)
      {
        if(s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
        {
          int offset = s2.charAt(i) - 'a';
          stat[offset]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(stat[i] == 0)
        {
          char ch = (char) (i + 'a');
          System.out.print(ch);
          System.out.print(" ");
        }
      }
    }
}