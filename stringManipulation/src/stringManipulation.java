import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringManipulation {
    public static void main(String[] args) {
        String myString = "Mississippi";
        //String[] allStrings = myString.split("s");
        //System.out.println(Arrays.toString(allStrings));

        String mySubString = myString.substring(2,5);
        System.out.println(mySubString.toString());

        Pattern p = Pattern.compile("Mi(.*?)pi");    //REGuLAR EXPRESSION LIVES HERE
        Matcher m = p.matcher(myString);
        while (m.find()) {
            System.out.println(m.group(1));
        }


        String name = "<div class=\"image\">\"<img src=\"http://cdn.posh24.se/images/:profile/121728d09e58f5d1b1e3091ac5fe5ad60\" alt=\"Danny Saucedo\"/></div>";
        Pattern pName = Pattern.compile("<img src=\"(.*?)\"");
        Matcher mName = pName.matcher(name);

        while (mName.find()) {
            System.out.println(mName.group(1));
        }
        pName = Pattern.compile("alt=\"(.*?)\"/></div>");
        mName = pName.matcher(name);

        while (mName.find()) {
            System.out.println(mName.group(1));
        }
    }
}
