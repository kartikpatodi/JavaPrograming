import java.util.Scanner;

public class ReverseFib
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] fib = new long[300];
        int n = sc.nextInt();

        fib[0] = 0;
        fib[1] = 1;

        for(int i=2;i<300;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        long f = fib[n];

        System.out.println(rev(f));
    }

    private static String rev(long x)
    {
        long sum = 0;
        while(x>0){
            long r = x%10;
            sum = sum*10+r;
            x/=10;
        }
        return String.valueOf(sum).replaceAll("0+$","").replaceAll("^0+","");
    }
}
