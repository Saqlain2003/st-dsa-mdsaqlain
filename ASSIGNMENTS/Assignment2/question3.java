package ASSIGNMENTS.Assignment2;

import java.util.*;
class question3
{
    //Reverse Number
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Long N=sc.nextLong();
        sc.close();
        Long reversed=0L;
        while (N!=0) 
        {
            Long temp=N%10;
            reversed=reversed*10+temp;
            N/=10;
        }
        System.out.println(reversed);
    }
}