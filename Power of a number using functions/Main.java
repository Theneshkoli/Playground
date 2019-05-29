import java.util.Scanner;
class Main{
  public static int abc(int b, int e){
    int pow,pw=1;
   for (pow = 1; pow<=e; pow++ ){
     pw = pw*b; 
   }
    return pw;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int b = sc.nextInt();
      int e = sc.nextInt();
      int power = abc(b,e);
      System.out.println(power);
	}
}