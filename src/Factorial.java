/**
 * Created by Kartik Patodi on 04-Dec-16.
 **/

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }

    public static int fact(int n)
    {
        if (n == 0 || n==1)
            return 1;
        return n * fact(n-1);
    }
}

