package day16_Recursion06;

public class MaxArraybyRecursion {
    static int PrintMaxArray(int[] arr,int idx){
        //base case
        if(idx==arr.length-1){
            return arr[idx];
        }

        //small problem
        int smallAns=PrintMaxArray(arr, idx+1);

        //self work and final ans
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,18,6,9,7};
        int idx=0;
        PrintMaxArray(arr,idx);
        System.out.println(PrintMaxArray(arr, 0));
    }
}
