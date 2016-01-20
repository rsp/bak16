import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad05 {

    public static void main(String[] args) throws Exception {

        int c;
        StringBuffer b = new StringBuffer();
        FileReader r = new FileReader(new File("source.txt"));
        while ((c = r.read()) > -1)
            b.append((char)c);

        String s = b.toString().replaceAll("\\b(\\d{2})(\\d{2})\\b", "$2$1");

        System.out.println(s);

    }

}
