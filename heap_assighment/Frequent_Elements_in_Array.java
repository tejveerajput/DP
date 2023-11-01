package heap_assighment;

import java.util.*;
public class Frequent_Elements_in_Array {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int b[]=topKFrequent(a,k);
        Arrays.sort(b);
        for(int i:b)System.out.print(i+" ");
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new LinkedList<>(m.entrySet());
        Collections.sort(l,(i1,i2)->{
            return i2.getValue()!=i1.getValue()?i2.getValue()-i1.getValue():i2.getKey()-i1.getKey();
        });
        int ans[]=new int[k];
        int in=0;
        for(int i=0;i<k;i++){
            ans[in++]=l.get(i).getKey();
        }
        return ans;
    }
}