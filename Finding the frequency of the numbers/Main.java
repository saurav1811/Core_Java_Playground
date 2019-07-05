import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = scan.nextInt();
      int r = 1,count = 0;
      while(r<=k)
      {
        for(int i=0;i<n;i++)
        {
          if(arr[i] == r)
            count++;
        }
        System.out.print(r + " " + count);
        System.out.print("\n");
        count = 0;
        r++;
      }
    }
}