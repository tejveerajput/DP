package heap_assighment;
import java.util.*;
public class Highest_frequency {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int max=0;
        int k=-1;
        for(int i:m.keySet()){
            if(m.get(i)>max){
                max=m.get(i);
                k=i;
            }
        }
        System.out.println(k);
    }
}