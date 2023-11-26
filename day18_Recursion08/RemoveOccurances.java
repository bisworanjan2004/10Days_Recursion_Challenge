package day18_Recursion08;

import java.util.Scanner;

public class RemoveOccurances {
    //First method
    static String removeOccurrences(String s, int idx){
        //Time coplexity -->No. of calls * Time taken in 1 call
        // n * n = O(n^2)
        if(idx==s.length())
        return "";
        String smallAns=removeOccurrences(s, idx+1);
        char currChar=s.charAt(idx);
        if((currChar!='a')&&(currChar!='A')){
            return currChar+smallAns;//concatination of two string is not constant time operation so it takes n time to exicute 
        }
        else{
            return smallAns;
        }
    }

    //Atlernative method
    static String removeOccurrences1(String s){
        //Time coplexity -->No. of calls * Time taken in 1 call
        // n * n = O(n^2)
        if(s.length()==0) return "";
        String smallAns=removeOccurrences1(s.substring(1));
        char currChar=s.charAt(0);
        if((currChar!='a')&&(currChar!='A')){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeOccurrences(s, 0));
        System.out.println(removeOccurrences1(s));
    }
}
