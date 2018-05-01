import java.util.Scanner;
import java.util.stream.IntStream;

public class BobAndString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n-- > 0)
        {
            String s = sc.next();
            String t = sc.next();
            int c;
            int[] hashS = new int[26];
            int[] hashT = new int[26];

            for(char ch:s.toCharArray()) hashS[ch-'a']++;
            for(char ch:t.toCharArray()) hashT[ch-'a']++;

            c = IntStream.range(0, 26)
                         .map(i -> Math.abs(hashS[i] - hashT[i]))
                         .sum();
            sb.append(c).append("\n");
        }
        System.out.println(sb.toString());
    }

}
