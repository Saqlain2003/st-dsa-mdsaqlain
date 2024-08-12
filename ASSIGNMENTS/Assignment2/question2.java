package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question2 
{
    public static int CountDigit(int number,int digit)
    {
        int count=0;
        while (number!=0) 
        {
            int temp=number%10;
            if(temp==digit)
            {
                count++;
            }
            number/=10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=sc.nextInt();
        sc.close();
        System.out.println(CountDigit(number, digit));
    }
}
