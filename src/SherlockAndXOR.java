import java.util.Scanner;

/**
 * Created by Kartik Patodi on 12-Jan-17.
 **/

public class SherlockAndXOR
{
    private static boolean isEven(int x)
    {
        return ((x % 2) == 0);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            long even = 0, odd = 0;
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                if(isEven(a[i])) even++;
                else odd++;
            }
            long c = even * odd;
            System.out.println(c);
        }
    }
}