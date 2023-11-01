package assignment_3;

import java.util.*;
public class Exchanging_Coins{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Long> dp=new HashMap<>();
        System.out.println(fun(n,dp));
    }
    static long fun(int n,Map<Integer,Long> dp){
        if(n==0)return 0;
        if(dp.containsKey(n))return dp.get(n);
        long ans=Math.max(n,fun(n/2,dp)+fun(n/3,dp)+fun(n/4,dp));
        dp.put(n,ans);
        return ans;
    }
}