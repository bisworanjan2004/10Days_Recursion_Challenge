package day11_Recursion01;

import java.util.Scanner;

public class printNaturalnumberDecreasing {
    static void printDecreasing(int n){
        //Base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);//n
        //recursive work
        printDecreasing(n-1);//n-1,n-2, .....1
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        printDecreasing(n);
    }
}
