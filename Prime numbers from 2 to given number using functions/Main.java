import java.util.Scanner;
class Main
{
    public static void isprime(int n)
    {
      int num = 2; 
      int is_prime = 1; 
      while(num <= n/2)
      {
       if(n%num == 0)
       {
         is_prime = 0;
         break;
       }  
       num = num + 1;
      }
       if(is_prime == 1)
        System.out.println(n);
     }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2;i<=n;i++)
        isprime(i);
	}
}