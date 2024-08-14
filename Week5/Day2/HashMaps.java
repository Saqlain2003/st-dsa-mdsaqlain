package Week5.Day2;
import java.util.*;
public class HashMaps 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Integer>mp=new HashMap<>();                 //initialize
        int[]arr={1,2,3,4,1,2,3,3,3,2};

        //add elements
        mp.put(1, 0);
        mp.put(2, 0);
        mp.put(3, 0);
        mp.put(4, 0);
        //display
        System.out.println(mp);
        arr[0]=2;
        arr[1]=4;

        //modify
        mp.put(1, 1);
        mp.put(4,2);
        System.out.println(mp.containsKey(3));
        System.out.println(mp);
        //remove element
        mp.remove(3);
        System.out.println(mp);
        System.out.println(mp.containsKey(3));
        System.out.println(mp.get(3));

        //iterate over a map
        for(Map.Entry m:mp.entrySet())              //m has two properties getkey,getvalue
        {
            System.out.println("the key is"+m.getKey()+"the value is"+m.getValue());
        }
     
    }
}
