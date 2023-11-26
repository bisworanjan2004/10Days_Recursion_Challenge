package day13_Recursion03;

public class countDigits {
  
    public static int cd(int n){
        //base case
        if(n/10==0){
            return 1;
        }
        //recursive work-> small ans
        int smallAns=cd(n/10);

        //self work
        return smallAns + 1;
    }
    public static void main(String[] args) {
        int n=2934889;
        System.out.println("The sum of the digits of "+n+"  is : ");
        System.out.println(cd(n));

    }
}


