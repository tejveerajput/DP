package heap_assighment;

import java.util.*;
public class Median_in_a_stream_of_running_integers  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Median_in_a_stream_of_running_integers o=new Median_in_a_stream_of_running_integers();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                o.addNum(sc.nextInt());
                System.out.print((int)o.findMedian()+" ");
            }
            System.out.println();
        }
    }
    List<Integer> l;
    public Median_in_a_stream_of_running_integers() {
        l=new ArrayList<>();
    }

    public void addNum(int num) {
        int i;
        for(i=0;i<l.size();i++){
            if(l.get(i)>num)break;
        }
        l.add(i,num);
    }

    public double findMedian() {
        if(l.size()%2==1)return l.get(l.size()/2);
        else return(l.get(l.size()/2-1)+l.get(l.size()/2))/2.0;
    }
}
