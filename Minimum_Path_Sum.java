public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(path_sum(arr,0,0));
    }
    public static int path_sum(int [][]maze,int cr,int cc){
    if(cr==maze.length-1 && cc==maze[0].length-1){
        return maze[cr][cc];
    }
    if(cr>=maze.length || cc>=maze[0].length){
        return Integer.MAX_VALUE;
    }
    int h=path_sum(maze, cr, cc+1);
    int v=path_sum(maze, cr+1, cc);
    return Math.min(h,v) + maze[cr][cc];

   }
    
}

