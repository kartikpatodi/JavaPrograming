import java.util.Scanner;

/**
 * Created by Kartik Patodi on 17-06-2017.
 **/

public class ASCIIArt
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int H = in.nextInt();

        if(in.hasNextLine())
        {
            in.nextLine();
        }

        String T = in.nextLine();
        T = T.toLowerCase();
        int len = T.length();
        int ansLen = len * L;
        int ansHeight = len * H;
        String[] row = new String[H];
        String[] ans = new String[ansHeight];

        for(int i = 0; i < H; i++)
        {
            row[i] = in.nextLine();
        }

        for(int i = 0; i < H; i++)
        {
            ans[i] = "";
            for(int j = 0; j < len; j++)
            {
                int indx = T.charAt(j) - 97;
                int beg = (L * indx);
                int end = beg + L;
                if(indx<-1 || indx>26)
                {
                    end = row[0].length();
                    beg = ansLen-L-1;
                }
//                System.err.printf("indx = %d char = %c beg = %d end = %d%n", indx, T.charAt(j), beg, end);
                ans[i] += row[i].substring(beg, end);
//                System.err.printf("ans[i] = %s%n",ans[i]);
            }
            System.out.println(ans[i]);
        }
    }
}
