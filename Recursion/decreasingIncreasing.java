package Recursion;
import java.util.Scanner;

public class decreasingIncreasing {
    static int n;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        n=in.nextInt();
        print(n);
        in.close();
    }
    public static void print(int n){
      if(n==0) return;
      System.out.println(n+" ");
      print(n-1);
      System.out.println(n+" ");
}
}
