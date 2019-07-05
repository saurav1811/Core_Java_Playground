import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      char res = (char) (ch - key);
      if(res>= 'a' && res<='z')
        System.out.println(res);
      else if(res>= 'A' && res<='Z')
        System.out.println(res);
      else
      {
        res = (char) (res + 26);
        System.out.println(res);
      }
    }
}