package day18_Recursion08;

import java.util.Scanner;

public class palindrumCheck {
    static boolean isPalindrum(String s, int l,int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrum(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // System.out.println(isPalindrum(s, 0, s.length()-1));
        if(isPalindrum(s, 0, s.length()-1)){
            System.out.printf(" %s :- The string is Palindrum ",s);
        }
        else{
            System.out.printf("%s :- The string is not a Palindrum ",s);
        }
    }
}
