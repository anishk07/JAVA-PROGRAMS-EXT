//JAVA Program To Display Triangular Pattern For Alphabets And Numbers In A Sequence
public class TrianglePattern

{            

    public static void main(String[] args)
    {
        System.out.println("ALPHABETICAL TRIANGLE");
        for (int i = 0; i <= 5; i++) { 
            int alphabet = 65; for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
            
        }
        for (int k = 0; k <= i; k++)
        {
            System.out.print((char) (alphabet + k) + " ");
            
        }
        System.out.println();
            
        }
        System.out.println("\nNUMERICAL TRIANGLE");

        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+ " ");
                
            }
            System.out.println();
            
        }         
        
    }
    
}
