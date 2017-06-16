import java.util.Scanner;

/**
 * Created by Kartik Patodi on 16-06-2017.
 **/

public class JumpOut
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

        int initialStep = 0;

        for(int i = 0; i < n; i++)
        {
            if(a[i] > (n - i))
            {
                initialStep = i + 1;
                break;
            }
        }

        System.out.println(initialStep);
    }
}
