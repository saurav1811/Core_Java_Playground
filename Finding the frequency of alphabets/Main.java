import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int stat[] = new int[26];
      for(int i=0;i<26;i++)
        stat[i] = 0;
      for(int i=0;i<sb.length();i++)
      {
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
        {
          int offset = sb.charAt(i) - 'a';
          stat[offset]++;
        }
        else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
        {
          int offset = sb.charAt(i) - 'A';
          stat[offset]++;
        }
      }
      for(int i=0;i<sb.length();i++)
      {
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
        {
          int offset = sb.charAt(i) - 'a';
          if(stat[offset] != 0)
          {
            System.out.print(sb.charAt(i));
            System.out.print(stat[offset]);
            System.out.print(" ");
            stat[offset] = 0;
          }
        }
        else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
        {
          int offset = sb.charAt(i) - 'A';
          if(stat[offset] != 0)
          {
            System.out.print((char)(sb.charAt(i) + 32));
            System.out.print(stat[offset]);
            System.out.print(" ");
            stat[offset] = 0;
          }
        }
      }
    }
}