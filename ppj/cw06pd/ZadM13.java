public class ZadM13 {

    public static void main(String[] args) {

        char[] t = {'1', 'a', '0', '.', '9'};

        for (int i = 0; i < t.length; i++)
            System.out.format("[%s] %s\n", t[i], test(t[i]));

    }

    static boolean test(char c) {
        return (c+"").matches("\\d");
    }

}
