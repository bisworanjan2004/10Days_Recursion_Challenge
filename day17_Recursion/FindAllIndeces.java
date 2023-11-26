package day17_Recursion;

// import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAllIndeces {
    static ArrayList<Integer> allIndices(int[] a,int n,int target,int idx){
        //Base case 
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx>=n){
            return ans;
        }
        //selfwork
        if(a[idx]==target){
            ans.add(idx);
        }
        ///Recursive work
        ArrayList<Integer> smallAns=allIndices(a, n, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,4,5,4};
        int target=4;
        int n=a.length;
        ArrayList<Integer> ans=allIndices(a, n, target, 0);//ans---> all indices
        for(Integer i: ans){
            System.out.println(i);
        }
        
    }
}
