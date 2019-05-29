import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner dk = new Scanner (System.in);
      int n = dk.nextInt();
      if (n>84)
          System.out.println("A");
     else if (n>74)
          System.out.println("B");
     else if (n>64)
          System.out.println("C");
     else if (n>54)
          System.out.println("D");
     else if (n>44)
          System.out.println("E");
      else
        System.out.println("Fail");
    }
}