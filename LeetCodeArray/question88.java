package LeetCodeArray;

public class question88 
{
    public static void MergeSortedArray(int[] nums1,int m,int[] nums2,int n)
    {   
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
