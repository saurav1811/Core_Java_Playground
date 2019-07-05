import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0,sum = 0;
      int temp = n;
      while(temp!=0)
      {
        temp = temp/10;
        count++;
      }
      temp = n;
      while(temp!=0)
      {
        sum = sum + (int)Math.pow((temp%10), count);
        temp = temp/10;
      }
      if(sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}