import java.util.Scanner;

/**
 * Created by Kartik Patodi on 14-07-2017.
 **/

public class MikeAliceAndRain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double pmb = sc.nextDouble();
        double pab = sc.nextDouble();
        double p1 = sc.nextDouble();

        double prs = p1 * (pmb * (1 - pab) + pab * (1 - pmb));

        System.out.printf("%.06f",prs);
    }
}
