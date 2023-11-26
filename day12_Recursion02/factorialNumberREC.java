package day12_Recursion02;

import java.util.Scanner;

public class factorialNumberREC {

    static int findFact(int n){
        if(n==0){
            return 1;
        }
        
        return n*findFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x=findFact(n);
        System.out.println("Factorial of "+n +" is : "+x);
    }
}
