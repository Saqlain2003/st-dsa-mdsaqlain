//Question 1
/*import java.util.*;
class Arrays
{
    public static int Sum (int[] arr)
    {
        int sum = 0;
        {
            for (int i = 0; i < arr.length; i++)
                sum += arr[i];

            return sum;
        }
    }
    public static void main(String[] args)
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in an array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Sum(arr));
        sc.close();
    }
}*/
//Question 4
/*import java.util.*;
class Arrays
{
    public static void revArray (int[] arr)
    {
        {
            for (int i = 0; i < arr.length/2; i++)
            {
                int temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
            }
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i]+" ");
            }     
        }
    }
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        revArray(arr);
    }
}*/
//Question 5
/*import java.util.*;
class Arrays
{
    public static void maxelement (int[] arr)
    {
        int max=0;
        for (int i:arr)
        {
            if(arr[i]>arr[i+1])
            {
                max=arr[i];
            }
        }
        System.out.print("maximum element:"+max);
    }
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxelement(arr);
    }
}*/
//Partial array reversed
import java.util.*;
class Arrays
{
    public static void revArray (int[] arr,int i,int j)
    {
        {
            for (int k=i;k<j;k++)
            {
                int temp=arr[k];
                arr[k]=arr[j-k-1];
                arr[j-k-1]=temp;
            }
            for (i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i]+" ");
            }     
        }
    }
    public static void main(String[] args)
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        revArray(arr,2,7);
    }
}