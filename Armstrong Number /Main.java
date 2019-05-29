import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int org_n,m,arm=0,pow=1;
      org_n = n;
      for(int i=1;i<=3;i++){
        m = n%10;
        n = n/10;
        arm = arm+(m*m*m);
      }
      //System.out.println(arm);
      if (arm==org_n)
        System.out.print("Armstrong Number");
      else
        System.out.print("Not a Armstrong Number");
	}
}