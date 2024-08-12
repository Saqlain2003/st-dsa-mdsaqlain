package Week5.Day1;
import java.util.Stack;
import java.util.*;

public class StacksIntro 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stk=new Stack<>();     //Definition

        /*stk.push(1);                     //Add an element
        stk.push(2);
        stk.push(10);
        stk.push(20);
        stk.push(100);
        stk.push(200);*/

        //System.out.println(stk.peek());        //View top value

        //System.out.println(stk.pop());         //Deletion of element

        Scanner sc=new Scanner(System.in);

        //int n=sc.nextInt();                     // Push element when user give how many element to be inserted
        /*for(int i=0;i<n;i++)
        {
            int a=stk.push(sc.nextInt());
        }
        System.out.println(stk);*/

        while(sc.hasNextInt())                     //when not given no.of element to be inserted
        {
            stk.push(sc.nextInt());
        }
        System.out.println(stk);

        /*while(!stk.empty())                        //pop each element till stack is not empty
        {
            stk.pop();
        }
        System.out.println(stk);*/                    //print stack , it gives element not address as it is a wrapper class
        //System.out.println(stk.search(10));         //search element
        //System.out.println(stk.size());               //size of stack
        //System.out.println(stk.size()-stk.search(10)); //return element from start as an array

        sc.close();
    }
}
