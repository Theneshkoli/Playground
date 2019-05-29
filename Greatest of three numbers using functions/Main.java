import java.util.Scanner;
class Main{
  public static int greatest(int a, int b, int c){
    int great = 0;
   if(a>b)
     great = a;
    else 
      great = b;
    if (c>great)
      great = c;
    return great;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int great = greatest(a,b,c);
      System.out.print(great);
	}
}