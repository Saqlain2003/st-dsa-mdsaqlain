package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question19 
{
    public static String OddEvenRule(int CarNum)
    {
        int SumEven=0;
        int SumOdd=0;
        while(CarNum>0)
        {
            int temp=CarNum%10;
            if(temp%2==0)
            {
                SumEven+=temp;
            }
            else
            {
                SumOdd+=temp;
            }
            CarNum/=10;
        }
        if(SumEven%4==0 || SumOdd%3==0)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int TestCase=sc.nextInt();
        for(int i=0;i<TestCase;i++)
        {
            int CarNum=sc.nextInt();
            if(OddEvenRule(CarNum).equals("Yes"))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
