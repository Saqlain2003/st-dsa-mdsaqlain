package Week4.Day1;

public class recursion 
{
    //TAIL RECURSION
    //Dry Run in copy
    static void print(int n)
    {
        //base case
        if(n==10)
        {
            System.out.println(n);
            return;                     //Result
        }
        System.out.println(n);          //Assumption
        print(n+1);
    }
    public static int Sum(int n, int a)
    {
        if(n==1)
        {
            return a+n;
        }
        return Sum(n-1,a+n);
    }
    public static int CountEven(int n, int count)
    {
        if(n==2)
            return count+1;
        if(n%2==0)
            count++;
        return CountEven(n-1,count);
    }
    //HEAD RECURSION
    static int sumHEAD(int n)
    {
        if(n==1)
            return 1;
        return n+sumHEAD(n-1);
    }
    static int CountEvenHead(int n)
    {
        if(n==1)
            return 0;
        if(n%2==0)
            return 1+CountEvenHead(n-1);
        return CountEvenHead(n-1);
    }
    //power function by Head recursion
    static int power(int base,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        return base*power(base, pow-1);
    }
    //power function by tail recursion
    static int powertail(int base,int pow,int ans)
    {
        if(pow==0)
        {
            return ans;
        }
        return powertail(base, pow-1,ans*base);
    }
    //Factorial by HR
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    //Factorial by TR
    static int factorialTail(int n,int ans)
    {
        if(n==0)
        {
            return ans;
        }
        return factorialTail(n-1,ans*n);
    }
    // Fibonacci by head recursion
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    // Fibonacci by tail recursion
    static int fibonacciTail(int n,int ans)
    {
        if(n==0 || n==1)
        {
            return ans+n;
        }
        return fibonacci(ans+n-1)+fibonacci(ans+n-2);
    }
    public static void main(String[] args) 
    {
        int n=5;      
        //int count=0;                     
        //print(n);
        //Sum of 1st n natural number
        //int sum=Sum(n,0);
        //Count even by tail recursion
        //int TotalEven=CountEven(n, count);
        //Sum of 1st n natural number by head recursion
        //int sum=sumHEAD(n);
        //Count even by head recursion
        //int count=CountEvenHead(n);
        //Power function by head recursion
        //int res=power(3, 4);
        //Power function by tail recursion
        //int res=powertail(3, 4, 1);
        //factorial by head recursion
        //int fact=factorial(5);
        //factorial by tail recursion
        //int fact=factorialTail(5,1);
        //Fibonacci
        int res=fibonacciTail(n,0);
        System.out.println(res);
    }
}
