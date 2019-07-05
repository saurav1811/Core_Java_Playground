import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int L = n%10;  // last digit obtained
       int temp = n;
       while(temp!=0)
       {
         temp = temp/10;
         if(temp<10)
         {
           break;
         }
       }
       int sum = L + temp;
       System.out.println(sum);
	}
}