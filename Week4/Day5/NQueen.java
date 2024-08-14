package Week4.Day5;

public class NQueen 
{
    public static boolean isValid(int[][] arr, int n,int row,int col)
    {
        for(int j=0;j<n;j++)
        {
            //horizontal 
            if(arr[row][j]==1 )
            {
                return false;
            }
            //vertical 
            else if(arr[j][col]==1)
            {
                return false;
            }
        }
        int r=row;
        int c=col;
        //Upper left diagonal
        for(;r>=0 && c>=0;r--,c--)
        {
            if(arr[r][c]==1)
            {   
                return false;
            }
        }
        //Upper right diagonal
        for(;r>=0 && c<n;r--,c++)
        {
            if(arr[r][c]==1)
            {   
                return false;
            }
        }
        //Lower left diagonal
        for(;r<n && c>=0;r++,c--)
        {
            if(arr[r][c]==1)
            {   
                return false;
            }
        }
        //Lower right Diagonal
        for(;r<n && c<n;r++,c++)
        {
            if(arr[r][c]==1)
            {   
                return false;
            }
        }
        return true;
    }
    public static void Solution(int[][] arr,int row,int col,int n)
    {
        if(col==n)
        {
            return;
        }
        for(row=0;row<arr.length;row++)
        {
            if(isValid(arr, n, row, col))
            {
                arr[row][col]=1;
                Solution(arr, row, col+1, n);
                arr[row][col]=0;
            }
        }
    }
    public static void main(String[] args) 
    {
        int n=4;
        int[][] arr=new int[n][n];
        Solution(arr, 0, 0,n);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;i++)
            {
                
            }
        }
    }
}
