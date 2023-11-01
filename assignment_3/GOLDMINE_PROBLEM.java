package assignment_3;

import java.util.*;
public class GOLDMINE_PROBLEM  {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[j][i]=sc.nextInt();
                }
            }
            for(int i=1;i<m;i++){
                for(int j=0;j<n;j++){
                    if(n==1){
                        a[i][j]+=a[i-1][j];
                        continue;
                    }
                    if(j==0){
                        a[i][j]+=Math.max(a[i-1][j],a[i-1][j+1]);
                    }
                    else if(j==n-1){
                        a[i][j]+=Math.max(a[i-1][j],a[i-1][j-1]);
                    }
                    else{
                        a[i][j]+=Math.max(a[i-1][j-1],Math.max(a[i-1][j],a[i-1][j+1]));
                    }
                }
            }
            int min=a[m-1][0];
            for(int i=0;i<n;i++){
                min=Math.max(min,a[m-1][i]);
            }
            System.out.println(min);
        }
    }
}
