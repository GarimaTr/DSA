package Recursion;
import java.util.Scanner;

public class reverse {
    static int n;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        n=in.nextInt();
        System.out.println(rev(n,0));
        in.close();
    }
    public static int rev(int n,int r){
        if(n==0) return r;
        return rev(n/10,r*10+(n%10));

    }
}