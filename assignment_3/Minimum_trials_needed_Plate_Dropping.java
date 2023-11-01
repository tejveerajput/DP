package assignment_3;

import java.util.*;
public class Minimum_trials_needed_Plate_Dropping {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            Integer dp[][]=new Integer[k+1][n+1];
            System.out.println(fun(k,n,dp));
        }
    }
    static int fun(int n,int k,Integer dp[][]){
        if(n==1)return k;
        if(k<=1)return k;
        int ans=Integer.MAX_VALUE;
        if(dp[n][k]!=null)return dp[n][k];

        for(int i=1;i<=k;i++){
            int a=Math.max(fun(n-1,i-1,dp),fun(n,k-i,dp));
            ans=Math.min(ans,a);
        }
        return dp[n][k]=ans+1;
    }
}
