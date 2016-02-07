import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

class List {
    int head;
    List rest;
    List(int i, List r) {
        head = i;
        rest = r;
    }
}

class Stack {
    List s;
    void push(int i) {
        s = new List(i, s);
    }
    int pop() {
        int i = s.head;
        s = s.rest;
        return i;
    }
    boolean isEmpty() {
        return s == null;
    }
}

class MyPrimeVerifier {
    static int isPrime(int n) throws Exception {
        if (n < 2)
            throw new Exception(n + " is not a prime");
        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                throw new Exception(n + " is not a prime");
        return n;
    }
}

public class Zad4 {

    public static void main(String[] args) throws Exception {

        Stack s = new Stack();
        StringBuffer b = new StringBuffer();
        try (FileReader r = new FileReader(new File("1.txt"))) {
            int c;
            while ((c = r.read()) > -1)
                b.append((char)c);
        } catch (Exception e) {
            System.out.println("File error: " + e);
        }

        StringTokenizer t = new StringTokenizer(b.toString());
        try {
            while (t.hasMoreTokens())
                s.push(MyPrimeVerifier.isPrime(Integer.parseInt(t.nextToken())));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        while (!s.isEmpty())
            System.out.println(s.pop());

    }

}
