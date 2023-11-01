package heap_assighment;

import java.util.*;
public class Subarrays_with_distinct_elements {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        function(a);
    }
    static void function(int a[]){
        int n=a.length;
        int ans=0;
        int j=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            while(j<n&& !s.contains(a[j])){
                s.add(a[j]);
                j++;
            }
            ans+=(j-i+1)*(j-i)/2;
            s.remove(a[i]);
        }
        System.out.println(ans);
    }
}