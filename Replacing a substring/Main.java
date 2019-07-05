import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
  	{
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String s1 = scan.nextLine();
      String s2 = scan.nextLine();
      String res = str.replace(s1,s2);
      System.out.println(res);
    }
}