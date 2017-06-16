import java.util.Scanner;

/**
 * Created by Kartik Patodi on 02-Jan-17.
 **/

public class TheBestInternetBrowser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            int c = 0;
            for(int i = 4; i < s.length() - 4; i++)
            {
                if((s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o') && (s.charAt(i) != 'u'))
                {
                    c++;
                }
            }
            System.out.println((c + 4) + "/" + s.length());
        }
    }
}
