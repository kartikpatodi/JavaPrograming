import java.util.Scanner;

/**
 * Created by Kartik Patodi on 22-Feb-17.
 **/

public class BreakingTheRecords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0], min = a[0], minc = 0, maxc = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
                minc++;
            }
            if(a[i] > max)
            {
                max = a[i];
                maxc++;
            }
        }
        System.out.println(String.format("%d %d", maxc, minc));
    }
}
