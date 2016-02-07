public class ZadM08 {

    static void rect(int a, int b, char c) {

        for (int i = 0; i < a*b; i++)
            System.out.format(i%b == b-1 ? "%s\n" : "%s", c);

    }

    public static void main(String[] args) {

        rect(4,  8, 'A');
        rect(2, 12, 'B');
        rect(4, 16, 'C');

    }

}
