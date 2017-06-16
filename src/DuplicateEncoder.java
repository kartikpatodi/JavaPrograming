import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 05-Feb-17.
 **/

public class DuplicateEncoder
{

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            HashMap<Character, String> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray())
            {
                c = Character.toLowerCase(c);
                if(set.contains(c))
                {
                    map.put(c,")");
                }
                else
                {
                    set.add(c);
                    map.put(c,"(");
                }
            }

            for(char c : s.toCharArray())
            {
                sb.append(map.get(Character.toLowerCase(c)));
            }
            System.out.println(sb.toString());
        }
    }
}