import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int opt = sc.nextInt();
      
      switch (opt){
        case 1:
      	int side = sc.nextInt();
     	int area_sq = side*side;
          System.out.print(area_sq);
          break;
           case 2:
      	int br = sc.nextInt();
          int le = sc.nextInt();
     	int area_rec = br*le;
          System.out.print(area_rec);
          break;
           case 3:
      	int base = sc.nextInt();
          int hi = sc.nextInt();
     	double area_tri = 0.5*base*hi;
          System.out.print(area_tri);
          break;
           case 4:
      	int radi = sc.nextInt();
     	double area_cir = 3.14*radi*radi;
          System.out.print(area_cir);
          break;
      }
    }
}