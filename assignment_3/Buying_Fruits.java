package assignment_3;

import java.util.*;
public class Buying_Fruits {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m[][]=new int[n][3];
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++)m[i][j]=sc.nextInt();
            }
            for(int i=1;i<n;i++){
                m[i][0]+=Math.min(m[i-1][1],m[i-1][2]);
                m[i][1]+=Math.min(m[i-1][0],m[i-1][2]);
                m[i][2]+=Math.min(m[i-1][0],m[i-1][1]);
            }
            Arrays.sort(m[n-1]);
            System.out.println(m[n-1][0]);
        }
    }
}
