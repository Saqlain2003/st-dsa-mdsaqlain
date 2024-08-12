package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int Num1=sc.nextInt();
        int Num2=sc.nextInt();
        sc.close();
        while(Num1<=Num2)
        {
            int n=0;
            int Armstrong=0;
            int sample=Num1;
            while(sample!=0)
            {
                sample/=10;
                n++;
            }
            int temp=Num1;
            while(temp!=0)
            {
                int digit=temp%10;
                Armstrong+=Math.pow(digit, n);
                temp/=10;
            }
            if(Armstrong==Num1)
            {
                System.out.println(Num1);
            }
            Num1++;    
        }
    }
}
