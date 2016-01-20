import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Zad02 {

    public static void main(String[] args) throws Exception {

        StringBuffer b = new StringBuffer();
        FileReader r = new FileReader(new File("source.txt"));

        int c;
        while ( (c = r.read()) != -1) {
            b.append((char)c);
        }

        StringTokenizer st = new StringTokenizer(b.toString());

        System.out.println(st.countTokens());

    }

}
