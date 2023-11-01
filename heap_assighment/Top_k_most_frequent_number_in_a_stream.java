package heap_assighment;

import java.util.*;
public class Top_k_most_frequent_number_in_a_stream  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(sc.nextInt());
                ArrayList<Integer> a=topKFrequent(l,k);
                for(int j:a){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> topKFrequent(ArrayList<Integer> nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new LinkedList<>(m.entrySet());
        Collections.sort(l,(i1,i2)->{
            return i2.getValue()!=i1.getValue()?i2.getValue()-i1.getValue():i1.getKey()-i2.getKey();
        });
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<k&&i<l.size();i++){
            ans.add(l.get(i).getKey());
        }
        return ans;
    }
}