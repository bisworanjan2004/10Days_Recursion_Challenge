package day17_Recursion;

public class SearchElement {
    static boolean Search(int[] arr,int n, int idx,int target) {
        //Base work
        if(idx>=n) return false;
        //self work
        if(arr[idx]==target) return true;
        //Recursive work
        return Search(arr, n, idx+1, target);


        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 18, 6, 9, 7 };
        int idx = 0,x=180;
        // Search(arr, idx,x);
        if(Search(arr,arr.length, idx, x))
        System.out.println("Yes");
        else 
        System.out.println("No");
        
    }
}
