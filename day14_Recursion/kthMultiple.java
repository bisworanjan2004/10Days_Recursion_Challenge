package day14_Recursion;

import java.util.Scanner;

public class kthMultiple {
    static void kmult(int n,int k){
        //base case
        if(k==0){
            // System.out.println(n);
            return;
        } 
        // if(k==1){
        //     System.out.println(n);
        //     return;
        // } 
        //recursive work
        kmult(n, k-1);
        //self work
        System.out.println(n*k);
       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        System.out.println("Enter y : ");
        int y=sc.nextInt();
        System.out.println("The multipliers of "+x+" are : ");
        kmult(x,y);
    }
}
