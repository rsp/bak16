public class ZadM10 {

    static boolean test(char c) {
        return (c+"").matches("[\\s\\p{Punct}]");
    }

    public static void main(String[] args) {

        char[] t = {'a', ' ', ',', '-', 'x', '\t', '\n'};

        for (int i = 0; i < t.length; i++)
            System.out.format("[%s] %s\n", t[i], test(t[i]));

    }

}
