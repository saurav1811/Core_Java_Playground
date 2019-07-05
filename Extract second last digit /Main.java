import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      	int N = in.nextInt();
      	int M = (N/10)%10;
      	System.out.println(M);
	}
}