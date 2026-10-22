package Recursion;
import java.util.Scanner;

public class power{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter Base");
        int a=in.nextInt();
        System.out.println("enter exponent:");
        int b=in.nextInt();
        System.out.println(a+" raised to the power "+b+" :"+pow(a,b));
        in.close();
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call= pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}