import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 26-Jan-17.
 **/

public class GoodString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();

        String s = sc.nextLine();
        int c = 0;

        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
                c++;
            }
            else
            {
                set.add(ch);
            }
        }
        System.out.println(c);
    }
}
