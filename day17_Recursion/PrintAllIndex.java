package day17_Recursion;

public class PrintAllIndex {
    static void FindAllIndex(int[] arr,int n, int idx,int target) {
        //Base work
        if((idx>n-1)) return ;
        //self work
        if(arr[idx]==target)
         System.out.println(idx);
        //Recursive work
        FindAllIndex(arr, n, idx+1, target);

    }
     public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 18, 6,6,6, 9, 7 };
        int idx = 0,x=6;
        FindAllIndex(arr,arr.length,idx,x);
        
    }
}
