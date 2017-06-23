import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-06-2017.
 **/

public class ChuckNorris
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine();
        StringBuilder msgBinary = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(char c : msg.toCharArray())
        {
            msgBinary.append(convert2Binary(c));
        }
        System.err.println(msgBinary);
        ans.append(convert2Block(msgBinary.toString()));

        System.out.println(ans.toString());

    }

    private static String convert2Block(String str)
    {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == '1') s.append("0 0");
            else s.append("00 0");
            while(i < str.length() - 1 && str.charAt(i + 1) == c)
            {
                s.append("0");
                i++;
            }
            s.append(" ");
        }
        System.err.printf("%s%n",s);
        return s.toString().trim();
    }

    private static String convert2Binary(char c)
    {
        return String.format("%07d", Integer.parseInt(Integer.toBinaryString(c)));
    }
}