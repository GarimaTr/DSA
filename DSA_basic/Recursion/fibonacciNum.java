package Recursion; 
import java.util.Scanner;
class fibonacciNum{
    static int n;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        n=in.nextInt();
        num(0,1);
        in.close();
    }
    public static void num(int a,int b){
        if(a<=n){
        System.out.print(a+" ");
        num(b, a+b);
    }
    }
}