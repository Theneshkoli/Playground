import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int a []= new int[size];
        for(int i =0 ; i<size ; i++)
        {
          a[i]=in.nextInt();
        }
      int l = a[0];
      for (int i =0; i<size ; i++)
      {
        if (a[i] > l)
        {
          l = a[i];
        }
      }
      System.out.println(l);
    }
}