import java.util.Scanner;
class Main
{
  public static void add(int size , int a[] , int sum)
  {
    for(int i = 0 ; i< size ; i++)
    { 
      for(int j = i+1 ; j< size ; j++)
      {
       int um = a[i] + a[j];
        if (um == sum)
        {
          System.out.println(a[i] + ","+" " + a[j]);
        }
      }
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int a[] = new int[size];
    for(int i = 0 ; i<size ; i++)
    {
      a[i] = in.nextInt();
    }
    int sum = in.nextInt();
    add(size , a , sum);
  }
}