package Recursion;
import java.util.Scanner;
class factorial{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int n=in.nextInt();
        System.out.println("factorial: "+fact(n));
        in.close();
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }
}

// or simply write
// return (n<=1)? 1: n*fact(n-1);