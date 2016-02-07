public class Zad02 {

    public static void main(String[] args) {

        String[] poz = "pole, topole, pale, opale, opole, top lekarz, pot leci".split(", ");
        String[] neg = "pola, topola, piles, topiles".split(", ");

        String r = ".*[^as]";

        for (String s: poz)
            System.out.println((s.matches(r) ? "[+]" : "[-]") + s);

        for (String s: neg)
            System.out.println((s.matches(r) ? "[-]" : "[+]") + s);


    }

}
