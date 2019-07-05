import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String vowels = new String("aAeEiIoOuU");
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < str.length(); i++)
    {
      if(vowels.indexOf(str.charAt(i)) == -1)
        sb.append(str.charAt(i));
    }
    System.out.println(sb);
  }
}