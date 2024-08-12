package LeetCodeArray;

public class question26 
{
    public static int removeDuplicates(int[] nums) 
    {
        //int[] arr=new int[nums.length];
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                //arr[k-1]=nums[i-1];
                nums[k]=nums[i];
                k++;
            }
            /*else if(nums[i-1]==0 && nums[i]==0 || nums[arr.length-1]==0)
            {
                for(int j=i-1;j<nums.length;j++)
                {
                    nums[j]=(Integer) null;
                    k=i;
                }
            }*/
        }
        /*for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }*/
        return k;
    }
    static void display(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)  
    {
        int nums[]={1,1,2};
        display(nums);
        int k=removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
        //display(nums);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
