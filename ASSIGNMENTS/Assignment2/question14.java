package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question14 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int CumulativeSum=0;
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            CumulativeSum+=num;
            if (CumulativeSum<0)
            {
                break;
            }
            arr.add(num);
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
