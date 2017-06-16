import java.io.IOException;
import java.util.Scanner;

/**
  *Created by Kartik Patodi on 04-Dec-16.
 **/

public class ADDREV
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int a, b, sum;
            a = sc.nextInt();
            b = sc.nextInt();
            int ra, rb, rs;
            ra = rev(a);
            rb = rev(b);
            sum = ra + rb;
            rs = rev(sum);
            System.out.println(rs);
        }
    }
    public static int rev(int x)
    {
        int r,sum=0;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            sum=sum*10+r;
        }
        return sum;
    }
}
