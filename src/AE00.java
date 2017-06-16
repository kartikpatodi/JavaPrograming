import java.io.IOException;
import java.util.Scanner;

/**
  *Created by Kartik Patodi on 04-Dec-16.
 **/

public class AE00
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        {
            int n=sc.nextInt();
            int ans=0;
            for (int i = 1; i <= ((int) Math.sqrt(n)); i++)
            {
                ans=ans+((n/i)-i+1);
            }
            System.out.println(ans);
        }
    }
}
