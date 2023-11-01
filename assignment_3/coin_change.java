package assignment_3;

import java.util.*;
public class coin_change {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)coins[i]=sc.nextInt();
        System.out.println(change(a,coins));

    }
    public static int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<dp.length;i++)dp[i][0]=1;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int inc=0,exc=0;
                if(coins[i-1]<=j){
                    inc=dp[i][j-coins[i-1]];
                }
                exc=dp[i-1][j];
                dp[i][j]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
