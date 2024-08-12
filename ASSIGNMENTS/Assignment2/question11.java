package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question11 
{
    public static long Chewbacca(long number)
    {
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
            if(arr[j]>4)
            {
                arr[j]=9-arr[j];
            }
        }
        if(arr[0]==0)
        {
            arr[0]=9;
        }
        long InvertNum=0;
        for(int k=0;k<count;k++)
        {
            InvertNum=InvertNum*10+arr[k];
        }
        return InvertNum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        sc.close();
        System.out.println(Chewbacca(number));
    }
}
