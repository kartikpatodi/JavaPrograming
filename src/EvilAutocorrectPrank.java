/**
 * Created by Kartik Patodi on 01-04-2017.
 **/

public class EvilAutocorrectPrank
{
    public static String autocorrect(String input)
    {
        return input.replaceAll("\\b((?:[Yy]ou+)|u)\\b","your sister");
    }
}
