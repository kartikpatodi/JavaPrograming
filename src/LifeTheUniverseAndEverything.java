/**
 * Created by Kartik Patodi on 03-Dec-16.
 **/

import java.util.Scanner;

public class LifeTheUniverseAndEverything
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=42)
        {
            System.out.println(t);
            t = sc.nextInt();
        }
    }
}
