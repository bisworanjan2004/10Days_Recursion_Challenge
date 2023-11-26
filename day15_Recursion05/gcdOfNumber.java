package day15_Recursion05;

import java.util.Scanner;

public class gcdOfNumber {
    static int GCD(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number to find their GCD : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(GCD(x,y));
    }
}
