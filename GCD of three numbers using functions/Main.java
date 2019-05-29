import java.util.Scanner;
public class Main{
  public static int gcd(int a, int b, int c){
    int min,gcd =1;
   if (a>b)
     min = b;
     else 
       min = a;
    if (min <c)
      min = c;
    while(min>=1){
     if (a%min ==0 && b%min == 0 && c%min ==0){
       gcd = min;
       break;
     }
      min-- ;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int gcd = gcd(a,b,c);
      System.out.print(gcd);
	}
}