class Ogniwo {

    public Ogniwo nastepne;
    public String nazwa;

}

public class Lista01 {

    public static void main(String[] args) {

        System.out.println("--- Tworzymy nowe ogniwa i nadajemy im nazwy:");

        Ogniwo ogniwo1 = new Ogniwo();
        ogniwo1.nazwa = "Pierwsze ogniwo";
        System.out.println("Stworzylismy ogniwo1 o nazwie " + ogniwo1.nazwa);

        Ogniwo ogniwo2 = new Ogniwo();
        ogniwo2.nazwa = "Drugie ogniwo";
        System.out.println("Stworzylismy ogniwo2 o nazwie " + ogniwo2.nazwa);

        Ogniwo ogniwo3 = new Ogniwo();
        ogniwo3.nazwa = "Trzecie ogniwo";
        System.out.println("Stworzylismy ogniwo3 o nazwie " + ogniwo3.nazwa);

        System.out.println("--- Laczymy ze soba ogniwa:");

        System.out.println("Laczymy pierwsze ogniwo z drugim.");
        ogniwo1.nastepne = ogniwo2;

        System.out.println("Laczymy drugie ogniwo z trzecim.");
        ogniwo2.nastepne = ogniwo3;

        System.out.println("Ustalamy, ze trzecie nie ma juz nastepnego.");
        // to jest niepotrzebne bo wartość domyślna to null ale nie zaszkodzi:
        ogniwo3.nastepne = null;

        System.out.println("Jaka jest nazwa ogniwa nastepnego po nr 1:");
        System.out.println(ogniwo1.nastepne.nazwa);

        System.out.println("Jaka jest nazwa nastepnego po nastepnym po nr 1:");
        System.out.println(ogniwo1.nastepne.nastepne.nazwa);

        // Właściwie dlaczego łańcuch ma nie być zamknięty?
        System.out.println("Laczymy ogniwo 3 z pierwszym.");
        ogniwo3.nastepne = ogniwo1;

        System.out.println("Jakie jest teraz piate ogniwo:");
        System.out.println(ogniwo1.nastepne.nastepne.nastepne.nastepne.nazwa);

    }

}
