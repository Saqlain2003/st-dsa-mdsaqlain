package Day6;
public class Array3 
{
    //Printing SubArray
    public static void subArray(int [] arr)
    {   
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                for (int k=i;k<=j;k++)
                    System.out.print(arr[k]);
                System.out.println();
            }
            
        }
 
        
    }
    public static void subArraySum(int [] arr)
    {   
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for (int k=i;k<=j;k++)
                    sum+=arr[k];
;                    System.out.print(sum);
                System.out.println();
            }
            
        }
 
        
    }
    public static void subArrayMaxSum(int [] arr)
    {   
        int maxSum=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for (int k=i;k<=j;k++)
                    sum+=arr[k];
                maxSum=Math.max(sum,maxSum);
;              
            }
            
        }  
        System.out.println(maxSum);       
    }
    //Kadane's Algorithm
    static int KadaneAlgo(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0)
            {
                currSum=0;
            }
            return maxSum;
        }
    }
    //Rotate by one Index
    static void RotateByOne(int[] arr)
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    //Rotate by K Index Method 1
    /*class Solution {
        public void rotate(int[] nums, int k) 
        {
            k%=nums.length;
            for(int m=0;m<k;m++)
            {
            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            }
        }
    }*/
    //Method 2 Rotate by k
     public static void rotate(int[] nums, int k) 
    {
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[(i+k)%nums.length]=nums[i];
        }
        //shallow copy does not effect array as it changes again before compilation
        //nums=arr;
        //deep copy
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
    }
    //Method 3 Rotate by k
    class Solution {
        public void reverse(int[] nums,int i,int j)
        {
            while(i<j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;i--;
            }
        }
        public void rotate(int[] nums, int k) 
        {
            k%=nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
    }

    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int [] arr={1,2,3,4,5};
        int [] nums={1,2,3,4,5};
        //subArray(arr);
        //subArrayMaxSum(arr);
        //display(arr);
        //RotateByOne(arr);     
        //display(nums);  
        //rotate(nums,3);
        //display(nums);
        
    }
}
