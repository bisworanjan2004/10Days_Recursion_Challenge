package day19_Recursion09;

import java.util.ArrayList;

public class stringSubsequences {
   static ArrayList<String> getSubsequence(String s){
     ArrayList<String> ans=new ArrayList<>();
        //Base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);//a
        ArrayList<String> smallAns=getSubsequence(s.substring(1));//["bc","b","c",""]
        //smallAns= ["bc","b","c"," "]
        //ans =["bc","abc","b","ab","c","ac","",a]
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;


   }
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> arr=getSubsequence(s);
        for (String sss : arr) {
            System.out.println(sss);
        }
    }
}
