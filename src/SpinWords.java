/**
 * Created by Kartik Patodi on 11-Feb-17.
 **/

public class SpinWords
{
    public String spinWords(String sentence)
    {
        String[] str = sentence.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String s : str)
        {
            if(s.length()>=5)
            {
                sb.append(new StringBuilder(s).reverse());
            }
            else
            {
                sb.append(s);
            }
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.lastIndexOf(" ")).toString();
    }
}
