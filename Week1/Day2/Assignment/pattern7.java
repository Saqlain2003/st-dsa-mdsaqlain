package Day2.Assignment;

public class pattern7 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1||i==5||j==1||j==5)
                {
                System.out.print("*   ");
                }
                else
                System.out.print("    ");
            }
            System.out.println("     ");
        }
    }
}