import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=0; i<n; i++){
        int num = n;
        for(int j=0; j<n-i; j++){
         System.out.print(num-i); 
          num--;
        }
       System.out.print("\n"); 
      }
	}
}