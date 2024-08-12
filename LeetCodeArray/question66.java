package LeetCodeArray;

public class question66 
{
    public static int[] PlusOne(int[] digits)
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            
                digits[i]=0;
            
        }
        int[] newDigits=new int[digits.length+1];
        newDigits[0]=1;
        System.arraycopy(newDigits, 0, digits, 0, newDigits.length);
        /*for(int i=0;i<newDigits.length;i++)
        {
            digits[i]=newDigits[i];
        }*/
        return newDigits;
    }
    public static void main(String[] args) 
    {
        int[] digits={9,9};
        PlusOne(digits);
        for(int i=0;i<digits.length;i++)
        {
            System.out.print(digits[i]+" ");
        } 
    }
}
