import java.util.Scanner;

/**
 * Created by Kartik Patodi on 22-06-2017.
 **/

public class JumbleLetter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            s = s.toLowerCase().replaceAll("[aeiouy]","").replaceAll("(.)",".$1");
            System.out.println(s);
        }
    }
}
