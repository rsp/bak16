public class ZadM12 {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)
            System.out.print(rand());

        System.out.println();

    }

    static char rand() {
        return (char)('a'+(Math.random()*('z'-'a'+1)));
    }

}
