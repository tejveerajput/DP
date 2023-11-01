package heap_assighment;

import java.util.*;
public class sort_game {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<sal> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            sal o=new sal(sc.next(),sc.nextInt());
            if(o.s>=k)l.add(o);
        }
        Collections.sort(l,(a,b)->{
            if(a.s!=b.s)return b.s-a.s;
            else return a.n.compareTo(b.n);
        });
        for(sal s:l)System.out.println(s.n+" "+s.s);
    }
    static class sal{
        int s;
        String n;
        sal(String name,int sal){
            s=sal;
            n=name;
        }
    }
}