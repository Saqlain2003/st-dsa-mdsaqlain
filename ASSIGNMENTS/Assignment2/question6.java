package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question6 
{
    public static int Fibonacci(int N)
    {
        int a=0,b=1;
        int Ans=0;
        for(int i=1;i<N;i++)
        {
            Ans=a+b;
            a=b;
            b=Ans;
        }
        return Ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        System.out.println(Fibonacci(N));
    }
}
