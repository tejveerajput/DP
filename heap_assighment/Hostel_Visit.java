package heap_assighment;

import java.util.*;
public class Hostel_Visit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Long> l=new PriorityQueue<Long>((e,f)->Long.compare(f,e));
        int q=sc.nextInt();
        int k=sc.nextInt();
        while(q-->0){
            int t=sc.nextInt();
            if(t==1){
                long x=sc.nextInt();
                long y=sc.nextInt();
                long d=x*x+y*y;
                if(l.size()<k){
                    l.add(d);
                }
                else{
                    if(d<l.peek()){
                        l.poll();
                        l.add(d);
                    }
                }
            }
            else {
                System.out.println(l.peek());
            }
        }
    }
}