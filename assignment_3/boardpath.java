package assignment_3;

import java.util.*;
public class boardpath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("\n"+t(n,m,""));
    }
    static int t(int n,int m,String a){
        if(n==0){
            System.out.print(a+" ");
            return 1;
        }
        if(n<0)return 0;
        int ans=0;
        for(int i=1;i<=m;i++){
            ans+=t(n-i,m,a+i);
        }
        return ans;
    }
}