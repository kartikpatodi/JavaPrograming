import java.util.Scanner;

/**
 * Created by Kartik Patodi on 22-Feb-17.
 **/

public class MultiplesOf3And5_Euler
{
    public static int sumDivisibleBy(int lim, int n)
    {
        int p = (lim-1)/n;
        return n*p*(p+1)/2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int lim = sc.nextInt();
            int sum = sumDivisibleBy(lim, 3) + sumDivisibleBy(lim, 5) - sumDivisibleBy(lim, 15);
            System.out.println(sum);
        }
    }
}
