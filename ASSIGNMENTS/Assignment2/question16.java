package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question16 
{
    public static int CountDigit(long SourceNumber)
    {
        int count=0;
        while(SourceNumber!=0)
        {
            SourceNumber/=10;
            count++;
        }
        return count;
    }
    public static String ConversionAnytoAny(long SourceNumber,int count,int sb,int db)
    {
        long Decimal=0;
        for(int i=0;i<count;i++)
        {
            long temp=SourceNumber%10;
            Decimal+=Math.pow(sb,i)*temp;
            SourceNumber/=10;
        }
        //ArrayList<Long> arr=new ArrayList<>();
        StringBuilder DestNumber=new StringBuilder();
        while (Decimal>0) 
        {
            long rem=Decimal%db;
            DestNumber.insert(0,Long.toString(rem,db));
            //arr.add(0,rem);
            Decimal/=db;
        }
        /*long[] nums=new long[arr.size()];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr.get(i);
        }*/
        /*long DestNumber=0;
        for(int i=0;i<nums.length;i++)
        {
            DestNumber=DestNumber*10+nums[i];
        }*/
        return DestNumber.toString();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        long SourceNumber=sc.nextLong();
        sc.close();
        int count=CountDigit(SourceNumber);
        String ans=ConversionAnytoAny(SourceNumber,count,sb,db);
        System.out.print(ans);
    }
}
