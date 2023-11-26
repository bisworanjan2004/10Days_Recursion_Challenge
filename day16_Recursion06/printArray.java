package day16_Recursion06;

public class printArray {
    static void PrintArray(int[] arr,int idx){
        //Base case
        if(idx==arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);
        //small problem
        PrintArray(arr, idx+1);

    }
    public static void main(String[] args) {
        int[] arr={2,4,6,7};
        int idx=0;
        PrintArray(arr,idx);
    }
}
