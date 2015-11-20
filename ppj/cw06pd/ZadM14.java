public class ZadM14 {

    static boolean test(char[] t) {
        return test(t, 0);
    }

    static boolean test(char[] t, int i) {
        return i == t.length ? true : test(t[i]) && test(t, i+1);
    }

    static boolean test(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {

        char[][] tt = {{'1', 'a', '0', 'x', '9'},
                       {'1', '2', '3', '4', '5', '6'},
                       {'0', '0', '0', '0', '0', '0', '.'}};

        for (char[] t:tt) {
            for (char c:t)
                System.out.print(c);
            System.out.format(" %s\n", test(t));
        }

    }

}
