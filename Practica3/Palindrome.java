import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
public class Palindrome 
{
    public static void main (String[] args) throws Exception
    {
    String line = "";  
    String original, reversed = "";
    String[] data = new String[65];
    String[] notPalindrome = new String[10];
    int j = 0;
    int m = 0;
    try   
    {  
    //parsing a CSV file into BufferedReader class constructor  
        BufferedReader br = new BufferedReader(new FileReader("palindrome.csv"));  
        while ((line = br.readLine()) != null)   //returns a Boolean value  
        {  
            original = "";
            reversed = "";
            data = line.split(",");
            original = data[j];
            int size = original.length();
            for (int i = size - 1; i >= 0; i--)
            {
                reversed = reversed + original.charAt(i);
            }
            if (original.equals(reversed))
            {
                continue;
            }
            else{
                notPalindrome[m] = original;
                m++;
            }

            //System.out.println(data[j]);
        } 
        br.close(); 
    }   
    catch (IOException e)   
    {  
         e.printStackTrace();  
    }  

    System.out.println("The words that are not palindrome are: ");
    for (int i = 0; i < notPalindrome.length; i++)
        {
            try 
            {
                if (notPalindrome[i] != null)
                {
                    System.out.println(notPalindrome[i]);
                }
            }
            catch(NullPointerException e)
            {
                continue;
            }
        }
    }
}
