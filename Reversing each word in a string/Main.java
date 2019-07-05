import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder temp = new StringBuilder("");
    StringBuilder res = new StringBuilder("");
    for(int i=0; i < sb.length(); i++)
    {
      if(sb.charAt(i) == ' ')
      {
        temp.reverse();
        res.append(temp);
        res.append(" ");
        temp.replace(0,temp.length(),"");
      }
      else
	  	temp.append(sb.charAt(i));
    }
    res.append(temp.reverse());
    System.out.print(res);
  }
}