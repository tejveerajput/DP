package heap_assighment;

import java.util.*;
public class Find_kth_Largest_Number {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int k=sc.nextInt();
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            System.out.println(findKthLargest(a,k));
        }
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            if(q.size()<=k-1){
                q.add(i);continue;
            }
            if(i>q.peek()){
                q.poll();
                q.add(i);
            }

        }
        return q.poll();
    }
}