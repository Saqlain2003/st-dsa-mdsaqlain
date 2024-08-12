package Week4.Day2;

public class Recursion1 
{
    //Toss Coin
    public static void Toss(int N, String ans)
    {
        if(N==0)
        {
            System.out.println(ans);
            return;
        }
        Toss(N-1,ans+"H");
        Toss(N-1, ans+"T");
    }
    //Generating Subsequences
    public static void Subsequences(String Q, String ans)
    {
        if(Q.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        Subsequences(Q.substring(1,Q.length()),ans+Q.charAt(0));
        Subsequences(Q.substring(1,Q.length()),ans);
    }
    //Count Subsequences using head recursion
    static int CountSubSeq(String Q)
    {
        if(Q.isEmpty())
        {
            return 1;
        }
        //including first character
        int Num1=CountSubSeq(Q.substring(1));
        //excluding first character
        //int Num2=CountSubSeq(Q.substring(1));
        return Num1*2;
    }
    //Valid Parentheses
    public static void ValidParentheses(int N,String ans,int l,int r)
    {
        if(l==N && r==N)
        {
            System.out.println(ans);
            return;
        }
        if(r>l || l>N)
        {
            return;
        }
        ValidParentheses(N, ans+"{",l+1,r);
        ValidParentheses(N, ans+"}",l,r+1);
    }
    public static void main(String[] args) 
    {
        int N=3;
        //Toss(N, "");
        //String Q="TAP";
        //int count=CountSubSeq(Q);
        //System.out.println(count);
        //Subsequences(Q,"");
        int l=0,r=0;
        ValidParentheses(N, "",l,r);
    }
}
