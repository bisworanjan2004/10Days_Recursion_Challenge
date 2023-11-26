package day11_Recursion01;

import java.util.Scanner;

//Write  aprogerram to print all natural numbers from 1 to n using recursion.
public class printNaturalNumber {

    static void PrintInteger(int x){
        if(x==1){
            System.out.println(x);
            return;
        }//without this line code the stack will be overflow and error will occur
        PrintInteger(x-1);//1,2,3,4....n-1
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number upto which you want to print by recursion : ");
        int x=sc.nextInt();
        PrintInteger(x);
    }
}
