import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n, m, sum = 0;
      n = sc.nextInt();
      while (n>0){
        m = n%10;
        sum = sum + m;
        n = n / 10;
      }
      System.out.println(sum);
	}
}