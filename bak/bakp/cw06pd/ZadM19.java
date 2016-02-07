public class ZadM19 {

    static int words(String s) {

        return s.replaceAll("[^\\s\\p{Punct}]+", "w")
                .replaceAll("[\\s\\p{Punct}]+", "").length();

    }

    public static void main(String[] args) {

        String[] t = {"Ala ma kota.",
                      "Ania lubi czerwone róże i niebieskie fiołki."};

        for (String s:t)
            System.out.format("\"%s\" %d\n", s, words(s));

    }

}
