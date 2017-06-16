import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-03-2017.
 **/

public class MonkTakesAWalk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');


        while(t-- > 0)
        {
            String s = sc.next();
            int count = 0;
            for(char c : s.toCharArray())
            {
                if(vowel.contains(c))   count++;
            }
            System.out.println(count);
        }
    }
}
