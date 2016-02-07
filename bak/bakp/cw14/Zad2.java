import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad2 {

    public static void main(String[] args) throws Exception {

        StringBuffer b = new StringBuffer();
        FileReader r = new FileReader(new File("bson-wiki.txt"));

        int c;
        while ((c = r.read()) > -1) {
            b.append((char)c);
        }

        int wc = 0, nc = 0;

        Matcher wm = Pattern.compile("\\b\\w+\\b").matcher(b);
        while (wm.find()) wc++;

        Matcher nm = Pattern.compile("\\b\\d+\\b").matcher(b);
        while (nm.find()) nc++;

        System.out.println("słowa:  " + wc);
        System.out.println("liczby: " + nc);

    }

}
