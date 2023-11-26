package day16_Recursion06;

public class printArraySum {
    static int PrintSumArray(int[] arr, int idx){
        if(idx==arr.length){
            return 0;
        }
        int sum=PrintSumArray(arr, idx+1);
        return sum+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,18,6,9,7};
        int idx=0;
        PrintSumArray(arr,idx);
        System.out.println(PrintSumArray(arr, 0));
    }
}
