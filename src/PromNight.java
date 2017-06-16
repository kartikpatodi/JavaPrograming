import static java.util.Arrays.sort;

import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-Jan-17.
 **/

public class PromNight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t =  sc.nextInt();
        while(t-->0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] hm = new int[m];
            int[] hn = new int[n];

            for(int i = 0; i < m; i++)
            {
                hm[i]=sc.nextInt();
            }

            for(int i = 0; i < n; i++)
            {
                hn[i]=sc.nextInt();
            }

            sort(hm);
            sort(hn);
        }
    }
}
