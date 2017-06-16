import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 11-Jan-17.
 **/

public class __MaximumOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            int c = (int) s.charAt(i);
            if(map.containsKey(c))
            {
                map.replace(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }


    }
}
