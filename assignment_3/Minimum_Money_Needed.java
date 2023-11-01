package assignment_3;

import java.util.*;
public class Minimum_Money_Needed {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int v[]=new int[w];
        for(int i=0;i<w;i++)v[i]=sc.nextInt();
        long dp[][]=new long[1001][1001];
        for(long d[]:dp){
            Arrays.fill(d,-1);
        }
        System.out.println(fun(w,w,v,dp));
    }
    static long fun(int n,int w,int v[],long dp[][]){
        if(w==0)return 0;
        if(n==0)return Integer.MAX_VALUE;
        if(dp[n][w]!=-1)return dp[n][w];
        long ans=fun(n-1,w,v,dp);
        if(w<n||v[n-1]==-1)return ans;
        ans=Math.min(ans,v[n-1]+fun(n,w-n,v,dp));
        return dp[n][w]=ans;
    }
}
