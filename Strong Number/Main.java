import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int digit = 1;
      int sum = 0;
      int fact;
      while(temp!=0)
      {
        digit = temp%10;
        fact = 1;
        for(int i=1;i<=digit;i++)
         fact *= i;
        sum += fact;
        temp = temp/10;
      }
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}