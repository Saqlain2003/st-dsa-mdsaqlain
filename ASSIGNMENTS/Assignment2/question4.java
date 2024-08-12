package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question4 
{
    public static int CountDigit(long Binary)
    {
        int count=0;
        while(Binary!=0)
        {
            Binary/=10;
            count++;
        }
        return count;
    }
    public static long Conversion(long Binary,int count)
    {
        long Decimal=0;
        for(int i=0;i<count;i++)
        {
            long temp=Binary%2;
            Decimal+=Math.pow(2,i)*temp;
            Binary/=10;
            //int Deci=Decimal;
        }
        return Decimal;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long Binary=sc.nextLong();
        sc.close();
        int count=CountDigit(Binary);
        System.out.println(Conversion(Binary,count));
        
    }
}
