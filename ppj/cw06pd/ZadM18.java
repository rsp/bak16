public class ZadM18 {

    static boolean palindrom(String s) {

        String t = s.replaceAll("\\W", "").toLowerCase();
        for (int i = 0, l = t.length(); i < l/2; i++)
            if (t.charAt(i) != t.charAt(l-i-1)) return false;
        return true;

    }

    public static void main(String[] args) {

        String[] t = {"Anna",
                      "Zakopane na pokaz.",
                      "Zakopane nie na pokaz.",
                      "Aibofobia"};

        for (String s:t)
            System.out.format("\"%s\" %s\n", s, palindrom(s));

    }

}
