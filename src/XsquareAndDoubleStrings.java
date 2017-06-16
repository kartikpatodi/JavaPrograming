import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 11-Jan-17.
 **/

public class XsquareAndDoubleStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            HashMap<Character, Integer> alpha = new HashMap<>();
            String s = sc.next();
            char[] chars = s.toCharArray();
            boolean isDouble = false;
            for(char i : chars)
            {
                if(alpha.containsKey(i))
                {
                    alpha.replace(i, alpha.get(i) + 1);
                    if(alpha.get(i) >= 2)
                    {
                        isDouble = true;
                       // break;
                    }
                }

                else
                {
                    alpha.put(i, 1);
                }

            }

//            System.out.println(alpha);
//            System.out.println(alpha.keySet());
            if(isDouble) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
