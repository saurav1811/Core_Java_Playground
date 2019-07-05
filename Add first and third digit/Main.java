import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      	int N = in.nextInt();
      	int L = N % 10;
      	int F = N / 100;
      	int S = L + F;
      	System.out.println(S);
	}
}