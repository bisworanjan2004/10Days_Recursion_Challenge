package day17_Recursion;

public class isSorted {
    static boolean isSorted(int[] a, int idx){
        //Base case
        if(idx==a.length-1)
        return true;

        if(a[idx]<a[idx+1])
        return isSorted(a, idx+1);
        else return false;

    }
    public static void main(String[] args) {
        int[] a={1,4,6,7,3,9};
        System.out.println(isSorted(a,0));
    }
}
