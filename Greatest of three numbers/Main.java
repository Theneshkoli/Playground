import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner dk = new Scanner (System.in);
      int n1,n2,n3,great;
      n1 = dk.nextInt();
      n2 = dk.nextInt();
      n3 = dk.nextInt();
      great = (n1+n2+n3)/3;
      if (great < n1)
      {System.out.println(n1);}
       else if (great < n2)
      {System.out.println(n2);}
       else if (great < n3)
      {System.out.println(n3);}
    }
}