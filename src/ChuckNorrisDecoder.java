import java.util.Scanner;

/**
 * Created by Kartik Patodi on 23-06-2017.
 **/

public class ChuckNorrisDecoder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] msg = sc.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();
        StringBuilder binaryMsg = convert2Binary(msg);
        System.err.println(binaryMsg);
        System.err.println(binaryMsg.length());
        if(binaryMsg.length() % 7 != 0)
        {
            System.out.println("INVALID");
        }
        else
        {
            System.err.println("Enter");
            for(int i = 0; i <= binaryMsg.length() - 7; i += 7)
            {

                sb.append((char) Integer.parseInt(binaryMsg.substring(i, i + 7), 2));
            }
            System.out.println(sb.toString());
        }

    }

    private static StringBuilder convert2Binary(String[] msg)
    {
        StringBuilder rslt = new StringBuilder();
        boolean one,zero;
        for(int i = 0; i < msg.length - 1; i += 2)
        {
            String c = msg[i];
            one = c.equals("0");
            zero = c.equals("00");

            if(one) rslt.append(new String(new char[msg[i + 1].length()]).replaceAll("\0", "1"));
            else if(zero){ rslt.append(new String(new char[msg[i + 1].length()]).replaceAll("\0", "0"));}
            else return new StringBuilder("*");
        }
        return rslt;
    }
}
