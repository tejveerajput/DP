package assignment_3;

import java.util.*;
public class Print_LCS {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int dp[][]=new int[a.length()+1][b.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String ans="";
        int i=dp.length-1,j=dp[0].length-1;
        while(i>0&&j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ans=a.charAt(i-1)+ans;
                i--;
                j--;
            }
            else if(dp[i][j]==dp[i][j-1]){
                j--;
            }
            else i--;
        }
        System.out.println(ans);
    }
}
