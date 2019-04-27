import java.util.*;

public class ExtractNumberFromString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            String[] numS = s.split("[^\\d]+");
            HashSet<String> setS = new HashSet<>(Arrays.asList(numS));
            long max = -1;
            String maxS = "-1";
            for(String str: setS){
                if(str.matches("[0-8]+") && Long.parseLong(str)>max){
                    max = Long.parseLong(str);
                    maxS = str;
                }
            }
            System.out.println(maxS);
        }
    }
}
