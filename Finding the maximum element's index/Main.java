import java.util.Scanner;
class Main
{
  public static void max(int size , int a[])
  {
    int i , x= 0 , m = a[0];
    for(i =0 ; i<size ; i++)
    {
      if (a[i] > m)
      {
        m = a[i];
        x = i;
      }
    }
    System.out.println(x);
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int a[] = new int[size];
    for(int i =0 ; i<size; i++)
    {
      a[i]= in.nextInt();
    }
    max(size , a);
  }
}