package day17_Recursion;

public class FindLastIndex {
    static int lastIndex(int[] a, int idx,int target){
        //Base case
       if(idx==a.length) return -1;
        //self work
       if(a[idx]==target) return idx;
       //recursive work
       int smallAns=lastIndex(a, idx-1, target);
       return smallAns;
        
    }
    public static void main(String[] args) {
        int[] a={1,4,6,4,6,5,4,4,3,4,6,8};
        System.out.println(lastIndex(a,a.length-1,4));
    }
}
