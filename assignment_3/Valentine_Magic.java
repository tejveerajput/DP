package assignment_3;

import java.util.*;
public class Valentine_Magic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[n];
        int g[]=new int[m];
        for(int i=0;i<n;i++)b[i]=sc.nextInt();
        for(int i=0;i<m;i++)g[i]=sc.nextInt();
        Arrays.sort(b);
        Arrays.sort(g);
        int dp[][]=new int[n][m];
        System.out.println(MinDiff(b,g,0,0,dp));
    }
    public static int MinDiff(int []boys,int []girls,int i,int j,int dp[][]){
        if(i==boys.length)return 0;
        if(j==girls.length)return 10000000;
        if(dp[i][j]!=0)return dp[i][j];
        int pair=Math.abs(boys[i]-girls[j])+MinDiff(boys,girls,i+1,j+1,dp);
        int nopair=MinDiff(boys,girls,i,j+1,dp);
        return dp[i][j]=Math.min(pair,nopair);
    }
}
