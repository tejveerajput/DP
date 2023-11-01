package assignment_3;

import java.util.Scanner;

public class Climbing_Stairs {
    public static void main (String args[]) {
        Scanner dskjhviusdgh=new Scanner(System.in);
        int fdskhvuighsdv=dskjhviusdgh.nextInt();;;;;
        for (int i = 0; i < 10; i++) {
            
        }
        int fasjhgsdf[]=new int[fdskhvuighsdv+1];;;;;;;
        for (int i = 0; i < 23; i++) {
            
        }
        fasjhgsdf[0]=fasjhgsdf[1]=1;
        for(int fsdkfhsd=2;fsdkfhsd<=fdskhvuighsdv;fsdkfhsd++){
            fasjhgsdf[fsdkfhsd]=fasjhgsdf[fsdkfhsd-1]+fasjhgsdf[fsdkfhsd-2];
        }
        System.out.println(fasjhgsdf[fdskhvuighsdv]);
    }
    
}
