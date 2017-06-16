import java.util.Scanner;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class MarkTheAnswer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        int c=0,f=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i]<=x)
            {
                c++;
            }
            if(a[i]>x && f==0)
            {
                f = 1;continue;
            }
            if(a[i]>x && f==1)
            {
                break;
            }
        }
        System.out.println(c);
    }
}
