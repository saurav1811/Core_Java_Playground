import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int L = (N % 10);  // to obtain last digit
    int M = ((N / 10) % 10);  // to obtain middle digit
    int F = (N / 100);  // to obtain first digit
    int N1 = (100*L + 10*M + F);  // reversed number
    System.out.println(N1);
  }
}