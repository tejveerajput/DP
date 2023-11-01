package heap_assighment;

import java.util.*;
public class Intersection_Of_Two_Arrays {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)b.add(sc.nextInt());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<b.size();j++){
                if(a.get(i)==b.get(j)){
                    ans.add(a.get(i));
                    b.remove(j);
                    break;
                }
                // System.out.println(a+" "+b+" "+j);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}