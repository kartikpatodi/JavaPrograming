import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-03-2017.
 **/

public class CandyReplenishingRobot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] c = new int[t];
        int toAddCandy = 0;
        int addedCandy = 0;
        int leftCandy = n;
        for(int i = 0; i < t; i++)
        {
            c[i] = sc.nextInt();
        }

        for(int i = 0; i < t - 1; i++)
        {
//            System.out.println("enter loop t = "+i);
            leftCandy -= c[i];
//            System.out.println("leftCandy = " + leftCandy);
            if(leftCandy < 5)
            {
//                System.out.println("less than 5");
                toAddCandy = n - leftCandy;
//                System.out.println("toAddCandy = " + toAddCandy);
                leftCandy += toAddCandy;
//                System.out.println("leftCandy after addedCandy = " + leftCandy);
                addedCandy += toAddCandy;
            }

//            System.out.println();
        }
        System.out.println(addedCandy);
    }
}
