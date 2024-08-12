package LeetCodeArray;

public class question35 
{
    public static int SearchInsertElement(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,3,5,6};
        System.out.println(SearchInsertElement(arr, 5));
        System.out.print(SearchInsertElement(arr, 2));
    }
}
