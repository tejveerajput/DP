package assignment_3;

import java.util.*;
class Number_of_Steps_to_reach_1
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(op(n));
    }
    static int op(int n){
        if(n<=2)return n-1;
        int ans=0;
        if(n%2==0){
            ans=1+op(n/2);
        }
        else {
            ans=1+Math.min(op(n+1),op(n-1));
        }
        return ans;
    }
}
