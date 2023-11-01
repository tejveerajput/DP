package heap_assighment;

import java.util.*;
public class Vertical_Order_Print_Binary_Tree{
    public static void main(String args[]) {
        Create_level_order t=new Create_level_order();
        t.vertical();
    }

}
class Create_level_order {
    class Node{
        int val;
        Node left,right;

        public Node(int val) {
            this.val = val;
        }
    }
    Node root;
    Scanner sc=new Scanner(System.in);

    public Create_level_order() {
        createTree();
    }
    private void createTree(){
        int num=sc.nextInt();
        Queue<Node> q=new LinkedList<>();
        int val=sc.nextInt();
        if(val==-1)return;
        root=new Node(val);
        q.add(root);
        while (!q.isEmpty()){
            Node n=q.poll();
            int v=-1;
            if(sc.hasNext())
                v=sc.nextInt();
            if(v!=-1){
                n.left=new Node(v);
                q.add(n.left);
            }
            if(sc.hasNext())
                v=sc.nextInt();
            else v=-1;
            if(v!=-1){
                n.right=new Node(v);
                q.add(n.right);
            }
        }
    }
    void vertical(){
        Map<Integer,List<Integer>> m=new TreeMap<>();
        vertical(root,m,0);
        for(int i:m.keySet()){
            for(int j:m.get(i)){
                System.out.print(j+" ");
            }
            // System.out.println();
        }
    }
    void vertical(Node root,Map<Integer,List<Integer>> m,int p){
        if(root==null)return;
        List<Integer> l=m.getOrDefault(p,new ArrayList<>());
        l.add(root.val);
        m.put(p,l);
        vertical(root.left,m,p-1);
        vertical(root.right,m,p+1);
    }
}