import java.util.Scanner;

/**
 * Created by Kartik Patodi on 11-Feb-17.
 **/

public class MonksEncounterWithPolynomial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();
            long ans = 0, start = 0, end = 100000;
            while(start <= end)
            {
                long mid = (start + end) / 2;
                long val = a * mid * mid + b * mid + c;
                if(val >= k)
                {
                    ans = mid;
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
