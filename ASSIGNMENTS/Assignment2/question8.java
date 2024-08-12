package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question8 
{
    public static int CountDigit(long number)
    {
        int count=0;
        while(number!=0)
        {
            number/=10;
            count++;
        }
        return count;
    }
    public static long InverseNumber(long number,int count)
    {
        long[] arr=new long[count];
        long pos=1;
        while(number!=0)
        {
            long digit=number%10;
            arr[(int) (digit-1)]=pos;
            number/=10;
            pos++;
        }
        int Inverse=0;
        for(int i=0;i<count;i++)
        {
            Inverse+=arr[i]*Math.pow(10,i);
        }
        return Inverse;
    }
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    long number=sc.nextLong();
    sc.close();
    int count=CountDigit(number);
    System.out.println(InverseNumber(number,count));
    }
}
