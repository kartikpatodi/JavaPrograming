import java.util.Scanner;

public class BoltSpeed
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int z = sc.nextInt();

            double tBall = Math.sqrt((2*h/32));
            double tRahul = x/z;

            if(tBall<tRahul) System.out.println("Raj");
            else System.out.println("Rahul");
        }
    }
}
