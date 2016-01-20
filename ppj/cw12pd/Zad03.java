import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Zad03 {

    public static void main(String[] args) throws Exception {

        StringBuffer b = new StringBuffer();
        FileReader r = new FileReader(new File("source.txt"));

        int c;
        while ( (c = r.read()) != -1) {
            b.append((char)c);
        }

        StringTokenizer st = new StringTokenizer(b.reverse().toString());

        while (st.hasMoreTokens()) {
            StringBuffer lb = new StringBuffer(st.nextToken());
            System.out.println(lb.reverse());
        }

    }

}
