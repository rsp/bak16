class Stos {

    private int ss;
    private int sp;
    private int[] a;

    Stos(int s) {
        this.ss = s;
        this.sp = 0;
        this.a = new int[s];
    }

    void push(int i) throws Exception {
        if (sp > ss - 1)
            throw new Exception("stack overflow");
        a[sp++] = i;
    }

    int pop() throws Exception {
        if (sp <= 0)
            throw new Exception("stack underflow");
        return a[--sp];
    }

}

public class Zad07 {

    public static void main(String[] args) throws Exception {

        Stos s = new Stos(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());

    }

}
