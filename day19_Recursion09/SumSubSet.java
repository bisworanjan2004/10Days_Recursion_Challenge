package day19_Recursion09;

public class SumSubSet {
    static void SumSubSet(int[] a,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        SumSubSet(a,n,idx+1,sum);
        SumSubSet(a,n,idx+1,sum+a[idx]);
    }
    public static void main(String[] args) {
        int[] a={2,4,5};
        SumSubSet(a,a.length,0,0);
    }
}
