import java.util.Scanner;

/**
 * Created by Kartik Patodi on 29-Jan-17.
 **/

public class GradingStudents
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int grade = sc.nextInt();
            if(grade >= 38)
            {
                int mod = grade % 10;
                if(mod == 3 || mod == 8)
                {
                    grade += 2;
                }
                if(mod == 4 || mod == 9)
                {
                    grade+=1;
                }
                System.out.println(grade);
            }
            else
            {
                System.out.println(grade);
            }
        }
    }
}