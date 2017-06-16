import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 29-Jan-17.
 **/

public class WeightedUniformStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char a = '`';
        String s = sc.nextLine();
        String _this = " ";
        int n = sc.nextInt();
        HashSet<String> strings = new HashSet<>();
        HashMap<String, Integer> wt = new HashMap<>();
        HashSet<Integer> map = new HashSet<>();
        for(int i = 1; i < 27; i++)
        {
            a += 1;
            wt.put(String.valueOf(a), i);
        }
        char[] chars = s.toCharArray();
        strings.add(String.valueOf(chars[0]));
        String prev = String.valueOf(chars[0]);
        for(int i = 1; i < s.length(); i++)
        {
            String now = String.valueOf(chars[i]);
            if(prev.equals(now))
            {
                if(_this.length() == 1)
                {
                    now += prev;
                    _this = now;
                }
                else now += _this;
            }
            else
            {
                prev = now;
            }
            strings.add(now);
            _this = now;
        }
        for(String str:strings)
        {
            int sum = str.length() * wt.get(String.valueOf(str.charAt(0)));
            map.add(sum);
        }
        for(int i = 0; i < n; i++)
        {
            int q = sc.nextInt();
            if(map.contains(q)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
