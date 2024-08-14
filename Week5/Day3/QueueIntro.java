package Week5.Day3;

import java.util.LinkedList;
import java.util.*;

public class QueueIntro 
{
    public static void main(String[] args) 
    {
        //Definition
        Queue<Integer> q=new LinkedList<>();   

        System.out.println(q.element());
        //Add Element
        q.add(1);
        q.add(10);
        q.add(100);
        q.add(1000);
        System.out.println(q);

        //Remove Element
        System.out.println(q.remove());    //Removes first element

    }
}
