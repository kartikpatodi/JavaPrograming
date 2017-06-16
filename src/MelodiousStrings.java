import java.util.Scanner;

/**
 * Created by Kartik Patodi on 25-03-2017.
 **/

public class MelodiousStrings
{
    public static final String VOWELS = "aeiou";
    public static final String CONSONANTS = "bcdfghjklmnpqrstvwxz";

    public static final int VOWEL = 0;
    public static final int CONSONANT = 1;

    public static final int V = 5;
    public static final int C = 20;

    static StringBuffer sb = new StringBuffer();
    static StringBuffer s = new StringBuffer();

    public static void gen(int n, int currType)
    {
        if(n == 0)
        {
            s.append(sb);
            s.append("\n");
            return;
        }
        if(currType == VOWEL)
        {
            for(int i = 0; i < V; i++)
            {
                sb.append(VOWELS.charAt(i));
                gen(n - 1, 1 - currType);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        else
        {
            for(int i = 0; i < C; i++)
            {
                sb.append(CONSONANTS.charAt(i));
                gen(n - 1, 1 - currType);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gen(n, VOWEL);
        gen(n, CONSONANT);
        System.out.println(s);
    }
}
