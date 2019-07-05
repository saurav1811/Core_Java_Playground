import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      String temp = str1 + str1;
      if(temp.contains(str2) == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}