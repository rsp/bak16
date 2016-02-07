import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad3 {

    public static void main(String[] args) throws Exception {

        StringBuffer b = new StringBuffer();
        FileReader r = new FileReader(new File("bson-wiki.txt"));

        int c;
        while ((c = r.read()) > -1) {
            b.append((char)c);
        }

        int ob = 0;
        Matcher bm = Pattern.compile("[\\[\\]]").matcher(b);
        while (bm.find()) {
            if (bm.group().equals("[")) ob++;
            else if (--ob < 0) break;
        }
        System.out.println("nawiasy " + (ob == 0 ? "ok" : "nie ok"));

    }

}
