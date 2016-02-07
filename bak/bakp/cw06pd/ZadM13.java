public class ZadM13 {

    static boolean test1(char c) {
        return java.lang.Character.isDigit(c);
    }

    static boolean test2(char c) {
        return (c+"").matches("\\d");
    }

    static boolean test3(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {

        char[] t = {'1', 'a', '0', '.', '9'};

        for (char c:t)
            System.out.format("[%s] %s\n", c, test3(c));

    }

}
