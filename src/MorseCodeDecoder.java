import java.util.HashMap;

/**
 * Created by Kartik Patodi on 01-04-2017.
 **/

public class MorseCodeDecoder
{
//    static
//    {
//        HashMap<String,String > MorseCode = new HashMap<>();
//        MorseCode.put("....","H");
//        MorseCode.put(".","E");
//        MorseCode.put("-.--","Y");
//        MorseCode.put(".---","J");
//        MorseCode.put("..-","U");
//        MorseCode.put("-..","D");
//    }

    public static String decode(String morseCode)
    {
        HashMap<String, String> MorseCode = new HashMap<>();
        MorseCode.put("....", "H");
        MorseCode.put(".", "E");
        MorseCode.put("-.--", "Y");
        MorseCode.put(".---", "J");
        MorseCode.put("..-", "U");
        MorseCode.put("-..", "D");


        morseCode = morseCode.replaceAll("\\s", "\\1");
        String[] code = morseCode.split("1");
        StringBuilder sb = new StringBuilder();


        for(String s : code)
        {
            sb.append(MorseCode.get(s));
        }

        String s1 = sb.toString();

        return s1.replaceAll("(null)+"," ").trim();
    }

}


//https://www.codewars.com/kata/decode-the-morse-code/train/java