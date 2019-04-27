import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BobAnIdiot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> map = new HashMap<>();
        int n = sc.nextInt();
        while(n-- > 0)
        {
            char first = sc.next()
                           .charAt(0);
            char second = sc.next()
                            .charAt(0);
            map.put(first, second);
            map.put(second, first);
        }
        StringBuilder sb = new StringBuilder();
        sc.nextLine();
        sb.append(sc.nextLine());
        char[] charArray = sb.toString()
                             .toCharArray();

        HashSet<Character> set = new HashSet<>(map.keySet());
        for(int i = 0; i < charArray.length; i++)
        {
            char c = charArray[i];
            if(set.contains(c))
            {
                charArray[i] = map.get(c);
            }
        }
        sb.delete(0,sb.length());
        sb.append(charArray);
        System.out.println(sb.toString());
    }
}
