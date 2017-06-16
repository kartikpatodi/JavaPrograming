import java.util.Scanner;

/**
 * Created by Kartik Patodi on 04-Dec-16.
 **/

public class ToggleString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res="";
        int x = s.length();
        for (int i = 0; i < x; i++)
        {
            char c=s.charAt(i);
            if(Character.isLowerCase(c))
            {
                res+=Character.toUpperCase(c);
            }
            if(Character.isUpperCase(c))
            {
                res+=Character.toLowerCase(c);
            }
        }
        System.out.println(res);
    }
}
