package Day5;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class sorting1
{
    //Find the index of the minimum element from an array
    public static void minelement (int[] arr)
    {
        int min=0;
        for (int i=1;i<arr.length;i++)
        {
            if(arr[min]>arr[i])
            {
                min=i;
            }
        }
    }
    //Traverse from given index
    public static int traverseindex (int[] arr,int a)
    {
        int min=a;
        for (int i=a+1;i<arr.length;i++)
        {
            if(arr[min]>arr[i])
            {
                min=i;
            }
        }
        return min;
    }
    //Selection Sort
    public static void selectionsort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int idx=traverseindex(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    //Insertion Sort
    static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j--];
            }
            arr[j+1]=key;
        }
    }
    //Binary searching
    static int binarysearch(int arr[],int key)
    {
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    //lowest bound if same element is there
    static int LowerBound(int arr[],int key)
    {
        Arrays.sort(arr);
        int start=0,end=arr.length-1,ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {   ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>key)
                end=mid-1;
            else 
                start=mid+1;
        }
        return ans;
    }
    //UpperBound if same elements are there
    static int UpperBound(int arr[],int key)
    {
        Arrays.sort(arr);
        int start=0,end=arr.length-1,ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {   ans=mid+1;
                start=mid+1;
            }
            else if(arr[mid]<key)
                start=mid+1;
            else 
                end=mid-1;
        }
        return ans;
    }
    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(i+" ");
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
        //minelement(arr);
        //selectionsort(arr);
        System.out.print(UpperBound(arr,3));
        sc.close();
    }
}