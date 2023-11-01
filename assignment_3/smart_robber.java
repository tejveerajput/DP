package assignment_3;

import java.util.*;
public class smart_robber {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int last=0,max=0;
            for(int i=0;i<n;i++){
                max=Math.max(sc.nextInt()+last,last=max);
            }
            System.out.println(max);
        }
    }
}
