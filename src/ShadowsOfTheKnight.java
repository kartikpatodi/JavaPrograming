import java.util.Scanner;

/**
 * Created by Kartik Patodi on 17-06-2017.
 **/

public class ShadowsOfTheKnight
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt(); // width of the building.
        int h = in.nextInt(); // height of the building.
        int n = in.nextInt(); // maximum number of turns before game over.
        int x0 = in.nextInt();
        int y0 = in.nextInt();

        //in.next();

        int left = 0, right = w - 1, top = 0, bottom = h - 1;

        System.err.printf("left = %d right = %d top = %d bottom = %d", left,right,top,bottom);

        x0 = right / 2;
        y0 = bottom / 2;

        System.out.println(x0 + " " + y0);

        // game loop
        while(n-->0)
        {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if(bombDir.length() > 2)
            {
                if(bombDir.charAt(0) == 'U')
                {
                    bottom = y0 - 1;
                }
                else if(bombDir.charAt(0) == 'D')
                {
                    top = y0 + 1;
                }
                if(bombDir.charAt(1) == 'L')
                {
                    right = x0 - 1;
                }
                else
                {
                    left = x0 + 1;
                }
            }
            else
            {
                if(bombDir.charAt(0) == 'U')
                {
                    bottom = y0 - 1;
                }
                else if(bombDir.charAt(0) == 'D')
                {
                    top = y0 + 1;
                }
                if(bombDir.charAt(0) == 'L')
                {
                    right = x0 - 1;
                }
                else
                {
                    left = x0 + 1;
                }
            }

            x0 = (right+left)/2;
            y0 = (top+bottom)/2;

            //debug
            System.err.printf("left = %d right = %d top = %d bottom = %d", left,right,top,bottom);

            //output
            System.out.println(x0 + " " + y0);
        }
    }
}
