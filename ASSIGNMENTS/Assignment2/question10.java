package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question10 
{
    public static long GCD(long num1,long num2)
    {
        if(Math.max(num1,num2)%Math.min(num1,num2)==0)
        {
            return Math.min(num1, num2);
        }
        int Ans=1;
        for(int i=2;i<Math.min(num1, num2);i++)
        {
            if(Math.min(num1,num2)%i==0 && Math.max(num1, num2)%i==0)
            {
                Ans=i;
            }
        }
        return Ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long num1=sc.nextLong();
        long num2=sc.nextLong();
        sc.close();
        System.out.println(GCD(num1, num2));
    }
}
