package day14_Recursion;

public class addNumber {
    static int seriesSum(int n){
        if(n==0) return 0;
        return seriesSum(n-1) + n;      
    }
 public static void main(String[] args) {
    System.out.println(seriesSum(50));
 }   
}
