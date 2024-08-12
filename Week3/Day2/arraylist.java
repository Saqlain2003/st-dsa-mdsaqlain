package Week3.Day2;

import java.util.*;

public class arraylist 
{
    public static void main(String[] args) 
    {
        //Syntax
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr.size());

        //add an element
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println(arr.size());
        //access
        System.out.println(arr.get(0));
        System.out.println(arr.get(3));
        //remove
        System.out.println(arr.remove(0));
        System.out.println(arr.get(0));
        //update
        System.out.println(arr.set(0, 10));
        System.out.println(arr);
        //sorting
        Collections.sort(arr);
        System.out.println(arr);
    }
}
