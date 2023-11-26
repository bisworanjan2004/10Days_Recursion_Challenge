package day12_Recursion02;
//find the fibonaci number 
import java.util.Scanner;

public class fibonaciSereisByRecursion {
    static int fibo(int n){
        if(n==0) return n;
        if(n==1) return n;
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n=sc.nextInt();
        int x=fibo(n);
        System.out.println("The Fibonaci number is : "+x);
        for (int i = 0; i <=10; i++) {
            System.out.println(fibo(i));
        }
    }
}
