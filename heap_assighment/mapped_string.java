package heap_assighment;

import java.util.*;
public class mapped_string{
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        fun(s,"");
    }
    static void fun(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        if(s.length()>1){
            int n=s.charAt(0)-'0';
            fun(s.substring(1),ans+(char)('A'+n-1));
            n=n*10+s.charAt(1)-'0';
            if(n<26)
                fun(s.substring(2),ans+(char)('A'+n-1));
        }
        else fun(s.substring(1),ans+(char)('A'+s.charAt(0)-'0'-1));
    }
}