package assignment_3;

import java.util.*;
public class Friends_Pairing_Problem {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(pair(n));
        }
    }
    static long pair(int n){
        if(n<=2)return n;
        return pair(n-1)+pair(n-2)*(n-1);
    }
}
