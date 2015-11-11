public class ZadM10 {

    public static void main(String[] args) {

        char[] t = {'a', ' ', ',', '-', 'x'};

        for (int i = 0; i < t.length; i++)
            System.out.println(t[i] + (test(t[i]) ? " tak" : " nie"));

    }

    static boolean test(char c) {
        return (c+"").matches("[\\s\\p{Punct}]");
    }

}
