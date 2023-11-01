package assignment_3;

import java.util.*;
public class CodeWars_2_0_Edit_Distance {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(minDistance(a,b));
    }
    public static int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word2.length();i++)dp[0][i]=i;
        for(int i=1;i<=word1.length();i++)dp[i][0]=i;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}