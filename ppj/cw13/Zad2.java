import java.io.File;
import java.io.FileReader;

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
}

public class Zad2 {

    public static void main(String[] args) throws Exception {

        Stack s = new Stack();

        FileReader r = new FileReader(new File("1.txt"));
        StringBuffer b = new StringBuffer();

        int c;
        while ( (c = r.read()) > -1 ) {
            b.append((char)c);
        }

        System.out.println(b.toString());

    }

}
