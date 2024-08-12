package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question13 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Num1=sc.nextInt();
        int Num2=sc.nextInt();
        sc.close();
        int n=1;
        for(int count=0;count<Num1;)
        {
            if((3*(n)+2)%Num2!=0)
            {
                int Ans=(3*(n)+2);
                System.out.println(Ans);
                count++;
            }
            n++;
        }
    }
}
