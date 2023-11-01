package assignment_3;

import java.util.*;
public class Tilling_Problem {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a=0,b=1;
        long c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}