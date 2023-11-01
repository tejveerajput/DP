public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s1="rabbbit";
        String t1="rabbit";
    }
    //s1-->coin 
    //s2-->amount
    //i-->s1 ka index
    //l-->t1 ka index
    public static int DistinctSubsequences(String s1 ,String t1 , int i ,int j){
        if(j==t1.length()){
            return 1;
        }
        if(i==s1.length()){
            return 0;
        }
        int inc =0,exc=0;
        if(s1.charAt(i)==t1.charAt(j)){
            inc=DistinctSubsequences(s1,t1,i+1,j+1);
        }
        exc=DistinctSubsequences(s1,t1,i+1,j);
        return inc+exc;
    }
}
