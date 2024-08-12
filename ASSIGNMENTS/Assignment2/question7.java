package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question7 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int minFarenVal=sc.nextInt();
        int maxFarenVal=sc.nextInt();
        int Step=sc.nextInt();
        sc.close();
        for(int i=minFarenVal;i<=maxFarenVal;i+=Step)
        {
            int Celcius=((i-32)*5)/9;
            System.out.println(i+"  "+Celcius);
        }
    }
}
