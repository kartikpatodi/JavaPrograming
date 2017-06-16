import java.util.Scanner;

/**
  *Created by Kartik Patodi on 12-Dec-16.
 **/

public class MonkAndLuckyMinimum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();

            long[] a = new long[n];
            long min =1000000000;
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                if(a[i]<min)
                    min=a[i];
            }
            long c=0;
            for (int j = 0; j < n; j++)
            {
                if(a[j]==min)
                    c++;
            }
            boolean even = c%2==0?true:false;
            if(even)
                System.out.println("Unlucky");
            else
                System.out.println("Lucky");
        }
    }
}
