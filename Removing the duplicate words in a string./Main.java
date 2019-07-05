import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String arr[] = str.split(" ",10);
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < arr.length; i++)
    {
      if(i == arr.length - 1)
      {
        sb.append(arr[i]);
        break;
      }
      if(arr[i].equals(arr[i+1]))
      {
        sb.append(arr[i]);
        sb.append(" ");
        i++;
      }
      else
      {
        sb.append(arr[i]);
        sb.append(" ");
      }
    }
    System.out.println(sb);
  }
}