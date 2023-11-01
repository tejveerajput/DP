package assignment_3;

import java.util.*;
public class K_Ordered_LCS {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<m;i++)b[i]=sc.nextInt();
        Integer dp[][][]=new Integer[n][m][k+1];
        System.out.println(lcs(a,b,0,0,k,dp));
    }
    static int lcs(int a[],int b[],int i,int j,int k,Integer dp[][][]){
        if(i==a.length||j==b.length)return 0;
        if(dp[i][j][k]!=null)return dp[i][j][k];
        int ans=0;
        if(a[i]==b[j]){
            ans=1+lcs(a,b,i+1,j+1,k,dp);
        }
        else{
            ans=lcs(a,b,i+1,j,k,dp);
            ans=Math.max(lcs(a,b,i,j+1,k,dp),ans);
            if(k>0){
                ans=Math.max(ans,1+lcs(a,b,i+1,j+1,k-1,dp));
            }
        }
        return dp[i][j][k]=ans;
    }
}
