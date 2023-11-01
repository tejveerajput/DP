package assignment_3;

import java.util.*;
public class Optimal_Game_Strategy_II {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Long dp[][]=new Long[n][n];
        System.out.println(fun(a,0,n-1,dp));
    }
    static long fun(int a[],int i,int j,Long dp[][]){
        if(i>j)return 0;
        if(dp[i][j]!=null)return dp[i][j];
        long f=a[i]+Math.min(fun(a,i+2,j,dp),fun(a,i+1,j-1,dp));
        long l=a[j]+Math.min(fun(a,i+1,j-1,dp),fun(a,i,j-2,dp));
        return dp[i][j]=Math.max(f,l);
    }
}
