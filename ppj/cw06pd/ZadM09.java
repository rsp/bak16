public class ZadM09 {

    static String mirror(String s) {
        return mirror(s, "");
    }

    static String mirror(String s, String m) {
        return s.length() == 0 ? m :
            mirror(s.substring(1), s.substring(0,1) + m);
    }

    public static void main(String[] args) {

        String s = "Ala ma kota";

        System.out.format("%s -> %s\n", s, mirror(s));

    }

}
