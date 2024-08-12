package Week2.Day1;
class Array4
{
    //display function
    public static void display(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    //Next Greatest to the Right ,Current element not included
    public static void NGRNI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=maxR;//Store
            maxR=Math.max(maxR,nums[i]);//Update
        }
    }
    //Next Greatest to the Right ,Current element included
    public static void NGRCI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            maxR=Math.max(maxR,nums[i]);//Update
            arr[i]=maxR;//Store
        }
    }
    //Next Greatest to the left ,Current element not included
    public static void NGLNI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=maxR;//Store
            maxR=Math.max(maxR,nums[i]);//Update
        }
    }
    //Next Greatest to the left ,Current element included
    public static void NGLCI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=0;i<nums.length;i++)
        {
            maxR=Math.max(maxR,nums[i]);//Update
            arr[i]=maxR;//Store
        }
    }
    //Next Smallest to the left ,Current element not included
    public static void NSLNI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=maxR;//Store
            maxR=Math.max(maxR,nums[i]);//Update    
        }
    }
    //Next Smallest to the left ,Current element included
    public static void NSLCI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            maxR=Math.max(maxR,nums[i]);//Update  
            arr[i]=maxR;//Store  
        }
    }
    //Next Smallest to the right ,Current element not included
    public static void NSRNI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=maxR;//Store
            maxR=Math.max(maxR,nums[i]);//Update    
        }
    }
    //Next Smallest to the right ,Current element included
    public static void NSRCI(int[] nums,int[] arr)
    {
        int maxR=0;
        for(int i=0;i<nums.length;i++)
        {
            maxR=Math.max(maxR,nums[i]);//Update   
            arr[i]=maxR;//Store 
        }
    }
    public static void main(String[] args) 
    {
        int[] nums={4,3,6,1,5,8,3,2};
        int[] arr=new int[nums.length];
        NGRCI(nums, arr);
        display(arr);
    }
}