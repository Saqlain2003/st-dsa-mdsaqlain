package Week4.Day3;

public class Backtracking 
{
    static int sum=0;
    //Backtracking
    static boolean backtracksumArray(int[] arr,int i,int k)
    {
        if(i==arr.length)
        {
            return true;
        }
        if(sum>k)
        {
            return false;
        }
        //include current value in ans
        sum+=arr[i];
        //check if this can be included in final ans
        if(!backtracksumArray(arr, i+1, k))
        {
            sum-=arr[i];
        }
        return true; 
    }
    public static void sumArray(int[] arr,int i,int k)
    {
        if(i==arr.length)
        {
            return;     
        }
        sum+=arr[i];
        if(sum>k)
        {
            sum-=arr[i];
            return;
        }
        sumArray(arr,i+1,15);
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6,7};
        backtracksumArray(arr,0,15);
        System.out.println(sum);
    }
}
