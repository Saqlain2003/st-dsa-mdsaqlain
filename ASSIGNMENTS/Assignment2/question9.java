package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question9 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        sc.close();
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                System.out.println("Not Prime");
            }
            else
            {
                System.out.println("Prime");
            }
        }
    }
}
