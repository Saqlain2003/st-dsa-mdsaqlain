package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question18 
{
    public static String Shopping(int M,int N,String name1,String name2)
    {
        int i=1;
        while(M>0 && N>0)
        {
            if(i%2!=0)
            {
                M-=i;
            }
            else
            {
                N-=i;
            }
            i++;
        }
        if(M<0)
        {
            return name1;
        }
        else
        {
            return name2;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int TestCase=sc.nextInt();
        String name1="Ayush";
        String name2="Harshit";
        for(int i=0;i<TestCase;i++)
        {
            int M=sc.nextInt();
            int N=sc.nextInt();
            if(Shopping(M, N, name1, name2).equals(name1))
            {
                System.out.println(name1);
            }
            else
            {
                System.out.println(name2);
            }
        }
        sc.close();
    }
}
