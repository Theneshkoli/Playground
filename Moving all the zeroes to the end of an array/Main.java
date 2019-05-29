import java.util.Scanner;
class Main
{
  public static void move(int size , int a[])
  {
    int x = 0 , y =0;
    for(int i = 0; i<size ; i++)
    {
      if (a[i] > 0)
      {
        x = a[i];
        System.out.print(x + " ");
      }
    }
    for (int i = 0 ; i<size ; i++)
    {
      if(a[i] == 0)
      {
        y = a[i];
        System.out.print(y + " ");
      }
    }
  }
    public static void main(String args[]) 
    {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int a[] = new int[size];
      for(int i = 0 ; i<size ; i++)
      {
        a[i] = in.nextInt();
      }
      move(size , a);
    }
}