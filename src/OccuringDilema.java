import java.util.Scanner;

/**
  *Created by Kartik Patodi on 09-Dec-16.
 **/

public class OccuringDilema
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            int[] a = new int[52];
            for (int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                switch (ch)
                {
                    case 'A': a[0]++;break;
                    case 'B': a[1]++;break;
                    case 'C': a[2]++;break;
                    case 'D': a[3]++;break;
                    case 'E': a[4]++;break;
                    case 'F': a[5]++;break;
                    case 'G': a[6]++;break;
                    case 'H': a[7]++;break;
                    case 'I': a[8]++;break;
                    case 'J': a[9]++;break;
                    case 'K': a[10]++;break;
                    case 'L': a[11]++;break;
                    case 'M': a[12]++;break;
                    case 'N': a[13]++;break;
                    case 'O': a[14]++;break;
                    case 'P': a[15]++;break;
                    case 'Q': a[16]++;break;
                    case 'R': a[17]++;break;
                    case 'S': a[18]++;break;
                    case 'T': a[19]++;break;
                    case 'U': a[20]++;break;
                    case 'V': a[21]++;break;
                    case 'W': a[22]++;break;
                    case 'X': a[23]++;break;
                    case 'Y': a[24]++;break;
                    case 'Z': a[25]++;break;
                    case 'a': a[26]++;break;
                    case 'b': a[27]++;break;
                    case 'c': a[28]++;break;
                    case 'd': a[29]++;break;
                    case 'e': a[30]++;break;
                    case 'f': a[31]++;break;
                    case 'g': a[32]++;break;
                    case 'h': a[33]++;break;
                    case 'i': a[34]++;break;
                    case 'j': a[35]++;break;
                    case 'k': a[36]++;break;
                    case 'l': a[37]++;break;
                    case 'm': a[38]++;break;
                    case 'n': a[39]++;break;
                    case 'o': a[40]++;break;
                    case 'p': a[41]++;break;
                    case 'q': a[42]++;break;
                    case 'r': a[43]++;break;
                    case 's': a[44]++;break;
                    case 't': a[45]++;break;
                    case 'u': a[46]++;break;
                    case 'v': a[47]++;break;
                    case 'w': a[48]++;break;
                    case 'x': a[49]++;break;
                    case 'y': a[50]++;break;
                    case 'z': a[51]++;break;
                }
            }
            for (int i = 0; i < 52; i++)
            {
                if(a[i]!=0)
                {
                    System.out.print(abc.charAt(i)+""+a[i]+" ");
                }
            }
            System.out.println();
        }

    }
}
