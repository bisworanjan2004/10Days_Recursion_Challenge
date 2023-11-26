package day17_Recursion;

public class FindIndex {
    static int FindIndex(int[] arr,int n, int idx,int target) {
        //Base work
        if(idx>=n) return -1;
        //self work
        if(arr[idx]==target)
         return idx;
        //Recursive work
        return FindIndex(arr, n, idx+1, target);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 18, 6, 9, 7 };
        int idx = 0,x=6;
        System.out.println(FindIndex(arr,arr.length,idx,x));//2
        
    }
}

