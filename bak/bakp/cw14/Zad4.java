import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad4 {

    public static void main(String[] args) {

        String s = "Wies w Polsce polozona ... 1998-1999 ... ...";

        int np = 0;
        Matcher pm = Pattern.compile("\\d+-\\d+").matcher(s);
        while (pm.find()) np++;

        System.out.println("pary liczb: " + np);

    }

}
