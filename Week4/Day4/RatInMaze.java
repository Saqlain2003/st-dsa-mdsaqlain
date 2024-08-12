package Week4.Day4;

public class RatInMaze 
{
    static int[][] vis=new int[100][100];
    static void display(int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(vis[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(char[][] maze,int i,int j,int n,int m)
    {
        if(i<n && i>=0 && j<m && j>=0 && maze[i][j]=='0' && vis[i][j]!=1)
        {
            //vis[i][j]=1;
            return true;
        }
        return false;
    }
    public static boolean Move(char[][] maze,int[][] vis,int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            vis[i][j]=1;
            return true;
        }
        if(isSafe(maze,i, j, n, m))
        {
            vis[i][j]=1;
            //Right
            if(Move(maze, vis, i, j+1, n, m))
            {
                return true;
            }
            //Down
            if(Move(maze, vis, i+1, j, n, m))
            {
                return true;
            }
            //Left
            if(Move(maze, vis, i, j-1, n, m))
            {
                return true;
            }
            //Up
            if(Move(maze, vis, i-1, j, n, m))
            {
                return true;
            }
            vis[i][j]=0;    //backtracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        char[][] maze ={
                       {'0','X','0','0','0'},
                       {'0','X','0','X','0'},                                    
                       {'0','X','0','X','0'},
                       {'0','X','0','X','0'},
                       {'0','0','0','X','0'},
        };
        Move(maze, vis, 0, 0, 5, 5);
        display(5, 5);             
    }
}
