import java.util.Scanner;
class Main { 
	public static void main(String[] args)
    {
  		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int starflag = 1;
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            if(starflag == 1)
            {
              System.out.print("*");
              starflag--;
            }
            else
            {
              System.out.print("#");
              starflag++;
            }
          }
          System.out.print("\n");
        }
    }
}