import java.util.Scanner;

public class MagicPotion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n];
        long[] sr = new long[n];

        s[0]=0;
        sr[0]=0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(i>0) s[i]+=(s[i-1]+a[i]);
            else s[i]+=a[i];
//            System.out.print(s[i]+" ");
        }

        for(int i = n-1; i >= 0; i--)
        {
            if(i < n - 1){ sr[n - i - 1] += (sr[n - i - 2] + a[i]);}
            else{ sr[n - i - 1] += a[i];}
//            System.out.print(sr[n-i-1]+" ");
        }

        for(int i = 0; i < n; i++)
        {
//            if()
        }

    }
}
