import java.util.Scanner;

/**
 * Created by Kartik Patodi on 11-Feb-17.
 **/

public class PalindromicNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=0;
            for(int i = a; i <= b; i++)
            {
                if(isPalindrome(i))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }

    private static boolean isPalindrome(int num)
    {
        int r, n = num, sum = 0;
        while(n > 0)
        {
            r = n % 10;
            n /= 10;
            sum = (sum * 10) + r;
        }
        if(num == sum)  return true;
        else return false;
    }
}
