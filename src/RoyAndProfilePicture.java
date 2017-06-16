import java.util.Scanner;

/**
 * Created by Kartik Patodi on 04-Dec-16.
 **/

public class RoyAndProfilePicture
{
    public static void main(String[] args)
    {
        int l,n,w,h;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        n = sc.nextInt();
        while(n>0)
        {
            w = sc.nextInt();
            h = sc.nextInt();
            if(w<l || h<l)
                System.out.println("UPLOAD ANOTHER");
            else if (w==h)
                System.out.println("ACCEPTED");
            else
                System.out.println("CROP IT");
            n--;
        }
     }
}
