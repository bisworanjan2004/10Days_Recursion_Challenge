package day15_Recursion05;

import java.util.Scanner;

public class GCDbyEuclidsMethod {
    static int GCD(int x,int y){
        if(y==0) return x;
        return GCD(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number to find their GCD : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(GCD(x,y));
    }
}
