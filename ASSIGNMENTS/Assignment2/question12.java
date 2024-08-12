package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question12 
{
    public static long ReplaceAll(long number)
    {
        if(number==0)
        {
            return 5;
        }
        long sample=number;
        int count=0;
        while(sample!=0)
        {
            sample/=10;
            count++;
        }
        long[] arr=new long[count];
        for(int i=count-1;i>=0;i--)
        {
            arr[i]=number%10;
            number/=10;
        }
        for(int j=0;j<count;j++)
        {
            if(arr[j]==0)
            {
                arr[j]=5;
            }
        }
        long ReplacedNum=0;
        for(int k=0;k<count;k++)
        {
            ReplacedNum=ReplacedNum*10+arr[k];
        }
        return ReplacedNum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        sc.close();
        System.out.println(ReplaceAll(number));
    }
}
