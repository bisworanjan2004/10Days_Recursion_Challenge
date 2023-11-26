package day18_Recursion08;

import java.util.Scanner;

public class reverseString {
    static String revString(String s, int idx) {
        if (idx == s.length())
            return "";

        return revString(s, idx + 1) + s.charAt(idx);

    }

    //time complexity --- > O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        System.out.println(revString(s, 0));

        //Palindrum check .....
        System.out.println("Pallindrum checking : ");
        String rev=revString(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is a Pallindrum",s);
        }
        else{
            System.out.printf(" %s is Not a palindrum",s);
        }
    }
}
