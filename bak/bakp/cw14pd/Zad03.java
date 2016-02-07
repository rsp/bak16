public class Zad03 {

    public static void main(String[] args) {

        String s = "Ala ma kota, a kot ma ale";
        for (String w : s.split("\\P{L}+"))
            System.out.println(w);

    }

}
