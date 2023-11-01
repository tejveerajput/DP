package assignment_3;

import java.util.*;
public class _0_1_Knapsack {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int capacity=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)a[i][1]=sc.nextInt();
        for(int i=0;i<n;i++)a[i][0]=sc.nextInt();
        Arrays.sort(a,(i1,i2)->i1[1]-i2[1]);
        int dp[][]=new int[a.length+1][capacity+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(a[i-1][1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-a[i-1][1]]+a[i-1][0]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
