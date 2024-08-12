package Week5.Day1;

import java.util.Stack;

public class Stack1 
{
    public static int[] NextGreaterRight(int[] arr)
    {
        int[] NGE=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            //Step 1
            while (!stk.empty() && arr[i]>stk.peek()) 
            {
                stk.pop();
                
            }
            //Step2
            if(stk.empty())
                {
                    NGE[i]=-1;
                }
                else
                {
                    NGE[i]=stk.peek();
                }
                //Step 3
                stk.push(arr[i]);
        }
        return NGE;
    }
    public static void main(String[] args) 
    {
        int[] arr={7,3,4,5,9,2};
        int nums[]=NextGreaterRight(arr);
        for(int n:nums)
        {
            System.out.print(n+" ");
        }
    }
}
