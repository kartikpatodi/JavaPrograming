import java.util.Scanner;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class MonkAndRotation
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = k%n;
            int[] a = new int[n+1];
            int[] ak = new int[n+1];
            for (int i = 1; i <= n; i++)
            {
                a[i] = sc.nextInt();
                ak[(i+k)%n]=a[i];
            }
            for (int i = 1; i <= ak.length; i++)
            {
                System.out.print(ak[i] + " ");
            }
            System.out.println("");
        }
    }
}