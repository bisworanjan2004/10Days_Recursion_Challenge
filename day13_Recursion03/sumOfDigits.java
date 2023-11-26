package day13_Recursion03;

public class sumOfDigits {
    public static int sod(int n){
        //base case
        if(n>=0 && n<=9){
            return n;
        }
        //recursive work-> small ans
        int smallAns=sod(n/10);

        //self work
        return smallAns + n%10;
    }
    public static void main(String[] args) {
        int n=2934889;
        System.out.println("The sum of the digits of "+n+"  is : ");
        System.out.println(sod(n));

    }
}
