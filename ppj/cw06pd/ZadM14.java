public class ZadM14 {

    public static void main(String[] args) {

        char[][] t = {{'1', 'a', '0', 'x', '9'},
                      {'1', '2', '3', '4', '5', '6'},
                      {'0', '0', '0', '0', '0', '0', '.'}};

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++)
                System.out.print(t[i][j]);
            System.out.format(" %s\n", test(t[i]));
        }

    }

    static boolean test(char[] t) {
        return test(t, 0);
    }

    static boolean test(char[] t, int i) {
        return i == t.length ? true : test(t[i]) && test(t, i+1);
    }

    static boolean test(char c) {
        return (c+"").matches("\\d");
    }

}
