package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question5 
{
    public static long LCM(long num1,long num2)
    {
        for(long i=Math.max(num1,num2);i<num1*num2;i++)
        {
            if(i%num1==0 && i%num2==0)
            {
                return i;
            }
        }
        return num1*num2;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long num1=sc.nextLong();
        long num2=sc.nextLong();
        sc.close();
        System.out.println(LCM(num1, num2));
    }
}
