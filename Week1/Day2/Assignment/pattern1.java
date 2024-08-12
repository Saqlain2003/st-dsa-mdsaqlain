package Day2.Assignment;

public class pattern1 
{
    public static void main(String[] args) 
    {
        // Outer loop for rows
        for (int i = 0; i < 5; i++) 
        {
            // Inner loop for columns
            for (int j = 0; j < 5; j++) 
            {
                System.out.print("*    ");
            }
            // New line after each row
            System.out.println();
        }
    }
}

