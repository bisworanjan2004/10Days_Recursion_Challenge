package day13_Recursion03;

public class power {
    static int pow(int p,int q){
        if(q==0) return 1;

        // return pow(p, q-1)*p;


        //Another method p^q=p^q/2 * p^q/2 ; --->for even
        // p^q=p * p^q/2 * p^q/2 -------> for odd value of q
        if(q%2==0){
            int small=pow(p,q/2);
            return small *small;
        }
        else{
            int small=pow(p,q/2);
            return p*small*small;
        }

        
    }
    public static void main(String[] args) {
        
        System.out.println("The power value is : ");
        System.out.println(pow(2,8));
    }
}
