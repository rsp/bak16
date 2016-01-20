import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Buf {
    StringBuffer b;
    Buf(String name) throws Exception {
        b = new StringBuffer();
        FileReader r = new FileReader(new File(name));
        int c;
        while ((c = r.read()) > -1) b.append((char)c);
    }
    void find(String r) { find("regex", r); }
    void find(String c, String r) { find(c, r, false, false); }
    void suma(String c, String r) { find(c, r, false, true); }
    void liczba(String c, String r) { find(c, r, true, false); }
    void find(String c, String r, boolean pn, boolean ps) {
        int n = 0, s = 0;
        System.out.format("\n *** %s:\n%s\n", c, r);
        for (Matcher m = Pattern.compile(r).matcher(b); m.find(); n++) {
            System.out.print(m.group() + " ");
            if (ps) s += Integer.parseInt(m.group());
        }
        if (pn) System.out.print("\nLiczba = " + n);
        if (ps) System.out.print("\nSuma = " + s);
        System.out.println();
    }
}

public class Zad01 {
    public static void main(String[] args) throws Exception {
        Buf b = new Buf("source.txt");
        b.find("słowa zaczynające się od liter j, k lub l", "(?i)\\b[jkl]\\p{L}*\\b");
        b.find("słowa kończące się na literę a lub e", "(?i)\\b\\p{L}*[ae]\\b");
        b.find("słowa zaczynające się małą literą", "\\b\\p{Ll}\\p{L}*\\b");
        b.find("słowa zaczynające się małą lub dużą literą m", "\\b[mM]\\p{L}*\\b");
        b.find("słowa złożone z trzech liter", "\\b\\p{L}{3}\\b");
        b.find("słowa złożone z nie mniej niż 3 i nie więcej niż 6 liter", "\\b\\p{L}{3,6}\\b");
        b.find("słowa nie zaczynające się od a, b i c", "(?i)\\b[^abc\\P{L}]\\p{L}*\\b");
        b.find("słowa z myślnikiem", "\\b\\p{L}+-\\p{L}+\\b");
        b.find("liczby parzyste", "\\b\\d*[02468]\\b");
        b.suma("suma wszystkich liczb", "\\b\\d+\\b");
        b.liczba("liczba znaków przestankowych", "\\p{P}");
        b.find("dwie pierwsze litery takie same jak dwie ostatnie", "(?i)\\b(\\p{L}{2})\\p{L}*\\1\\b");
    }
}
