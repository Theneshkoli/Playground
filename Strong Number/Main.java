import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int fact;
      int strong=0 ,m = 0;
      int org_n;
      org_n=n;
      while (n!=0){
        fact = 1;
      m = n%10;
        for (int j=1; j<=m;j++){
        fact = fact * j; 
        }
       n = n/10;
        strong = strong + fact;
      }
      if (strong ==org_n)
        System.out.print("Yes");
      else 
        System.out.print("No");
      }
	}
