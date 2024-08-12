package Week2.Day2;

import java.util.Scanner;

public class TwoDArray 
{
    public static void Insert(int[][] arr)
    {   
        int num=1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                //arr[i][j]=sc.nextInt();
                arr[i][j]=num++;
            }
        }
        sc.close();
    }
    public static void display(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] SearchElement(int[][] arr,int target)
    {
        int[] idx={-1,-1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==target)
                {
                    idx[0]=i;
                    idx[1]=j;
                    return idx;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) 
    {
        int[][] arr=new int[5][3];
        Insert(arr);
        display(arr);
        int[] nums=SearchElement(arr, 5);
        System.out.println(nums[0]+" "+nums[1]);
    }
}
