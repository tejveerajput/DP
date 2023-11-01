package assignment_3;

import java.util.*;
public class Count_Number_of_Binary_Strings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Long dp[]=new Long[n+1];
            System.out.println(fun(n,0,dp));
        }
    }
    static long fun(int n,int i,Long dp[]){
        if(i>=n)return 1L;
        if(dp[i]!=null)return dp[i];
        return dp[i]=fun(n,i+2,dp)+fun(n,i+1,dp);
    }
}