package Week3.Day2;

public class Strings 
{
    public static String changeName(String name)
    {
        String ans="";
        for(int i=0;i<name.length();i++)
        {
            ans+=(char)(name.charAt(i)+1);
            
        }
        return ans;
    }
    public static String reverseName(String name)
    {
        String ans="";
        for(int i=name.length()-1;i>=0;i--)
        {
            ans+=name.charAt(i);
        }
        return ans;
    }
    public static boolean Palindrome(String name)
    {
        //name=name.toLowerCase();
        String temp=reverseName(name);
        return name.equalsIgnoreCase(temp);
        //return name.compareToIgnoreCase(temp);                //returns int 
    }
    public static String reverseSentence(String sentence)
    {
        sentence=sentence.trim();
        String[] arr=sentence.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--)
        {
            ans+=arr[i]+" ";
        }
        return ans.trim();
    }
    public static int LongestSubstring(String name)
    {   
        int count=1,temp=1;
        int i=1;
        while(i<name.length())
        {   
            if(name.charAt(i-1)==name.charAt(i))
            {
                temp++;
            }
            else
            {
                count=Math.max(temp, count);
                temp=1;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        //Create a string s="your_name" and print successor of every character
        //String s="Namans";
        //String ans=changeName(s);
        //return string which reverse name
        //String ans=reverseName(s);
        //Reverse sentence
        //String sentence="Today is Thursday";
        //System.out.println(reverseSentence(sentence));
        //Substring function
        //String s2="Parabolla";
        //System.out.println(s2.substring(0,8)); //endString not included
        //String s1="A";
        //String s2="a";
        //System.out.println(s1.compareTo(s2));   //compares ASCII value
        //print palindrome
        //System.out.println(Palindrome(s));
        //longest substring with repetative char
        String s="aarav";
        int len=LongestSubstring(s);
        System.out.println(len);
    }
}
