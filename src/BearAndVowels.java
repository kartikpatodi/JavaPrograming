import java.util.Scanner;

/**
 * Created by Kartik Patodi on 02-Jan-17.
 **/

public class BearAndVowels
{

    private static boolean chk(char x)
    {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y';
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            int c = 0, cv = 0, cc = 0, i, n = s.length();
            for(i = 0; i < n; i++)
            {
                if(chk(s.charAt(i)))
                {
                    cv++;
                }
                else
                {
                    if(i < n - 2 && !chk(s.charAt(i)) && !chk(s.charAt(i + 1)) && !chk(s.charAt(i + 2)))
                    {
                        c = 1;
                        break;
                    }
                    cc++;
                }
            }
            if(cc > cv || c == 1) System.out.println("hard");
            else System.out.println("easy");
        }
    }
}