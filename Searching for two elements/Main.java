import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int a[]= new int[size];
      int i;
      for( i = 0 ; i< size ; i++)
      {
        a[i]= in.nextInt();
      }
      int x = in.nextInt();
      int y = in.nextInt();
      int is_x = 0, is_y = 0;
      for ( i = 0;i<size ; i++)
      {
        if (a[i] == x)
        {
          is_x = 1;
          break;
        }
      }
      if (is_x == 1 )
      {
        System.out.println(i);
      }
      else 
      {
        System.out.println("-1");
      }
      for (i = 0; i< size ; i++)
      {
        if (y == a[i])
        {
          is_y = 1;
          break;
        }
      }
      if (is_y == 1)
      {
        System.out.println(i);
      }
      else
      {
        System.out.println("-1");
      }
    }
}