import java.util.Scanner;

/**
 * Created by Kartik Patodi on 24-Feb-17.
 **/

public class NextRound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int c = 0;
        int min = a[k - 1];
        for(int i = 0; i < n; i++)
        {
            if(a[i] >= min && a[i]!=0) c++;
            else break;
        }
        System.out.println(c);
    }
}
