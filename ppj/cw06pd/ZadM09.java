public class ZadM09 {

    public static void main(String[] args) {

        String[] t = {"ABC", "Ala ma kota", "To be or not to be"};
        
        for (int i = 0; i < t.length; i++)
            System.out.format("%s -> %s\n", t[i], mirror(t[i]));

    }

    static String mirror(String s) {
        return mirror(s, "");
    }

    static String mirror(String s, String m) {
        return s.length() == 0 ? m :
            mirror(s.substring(1), s.substring(0,1) + m);
    }

}
