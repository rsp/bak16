public class ZadM19 {

    static int words(String s) {

        return s.replaceAll("[^\\s\\p{Punct}]+", "w")
                .replaceAll("[\\s\\p{Punct}]+", "").length();

    }

    public static void main(String[] args) {

        String[] t = {"Ala ma kota.",
                      "Ania lubi czerwone róże i niebieskie fiołki."};

        for (int i = 0; i < t.length; i++)
            System.out.format("\"%s\" %d\n", t[i], words(t[i]));
    }

}
