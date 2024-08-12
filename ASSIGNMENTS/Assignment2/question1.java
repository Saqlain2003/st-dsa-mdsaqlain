package ASSIGNMENTS.Assignment2;
import java.util.*;
public class question1 
{
    public static void main(String[] args) 
    {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        String number=sc.nextLine();
        sc.close();
        int OddSum=0,EvenSum=0;
        for(int i=0;i<number.length();i++)
        {
            int digits=Character.getNumericValue(number.charAt(i));
            if(i%2!=0)
            {
                OddSum+=digits;
            }
            else
            {
                EvenSum+=digits;
            }
        }
        System.out.println("OddSum:"+OddSum);
        System.out.println("EvenSum:"+EvenSum);*/
                                        //OR
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        sc.close();
        ArrayList<Integer> digits=new ArrayList<>();
        if(number==0)
        {
            digits.add(0);
        }
        else
        {
            while (number>0) 
            {
                int digit=number%10;
                digits.add(0,digit);
                number/=10;
            }
        }
        int OddSum=0,EvenSum=0;
        for(int i=0;i<digits.size();i++)
        {
            if(i%2==0)
            {
                OddSum+=digits.get(i);
            }
            else
            {
                EvenSum+=digits.get(i);
            }
        }
        System.out.println("OddSum:"+OddSum);
        System.out.println("EvenSum:"+EvenSum);
    }
}
