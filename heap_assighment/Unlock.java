package heap_assighment;

import java.util.*;
public class Unlock  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        Map<Integer,Integer> m=new HashMap<>();
        PriorityQueue<Integer> q=new PriorityQueue<>((c,d)->d-c);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            q.add(a[i]);
            m.put(a[i],i);
        }
        for(int i=0;i<n;i++){
            int max=q.poll();
            int in=m.get(max);
            if(in!=i){
                m.put(a[i],in);
                m.put(a[in],i);
                int t=a[in];
                a[in]=a[i];
                a[i]=t;
                k--;
                if(k==0)break;
            }
        }
        for(int i:a)
            System.out.print(i+" ");
    }
}

