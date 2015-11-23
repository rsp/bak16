class Ogniwo {

    // każde ogniwo może mieć jakąś nazwę:
    public String nazwa;
    // oraz mieć połączenie z następnym ogniwem w łańcuchu:
    public Ogniwo nastepne;

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

        // ogniwo1.nastepne to ogniwo2 (bo takie tam zapisalismy)
        // wiec ogniwo1.nastepne.nazwa to jakby
        // (ogniwo1.nastepne).nazwa czyli:
        //            ogniwo2.nazwa

        System.out.println("Jaka jest nazwa nastepnego po nastepnym po nr 1:");
        System.out.println(ogniwo1.nastepne.nastepne.nazwa);

        // ogniwo1.nastepne to ogniwo2
        // ogniwo1.nastepne.nastepne to jakby (ogniwo1.nastepne).nastepne
        // czyli ogniwo2.nastepne a więc ogniwo3

        // więc:
        // ogniwo1.nastepne.nastepne.nazwa to:
        //          ogniwo2.nastepne.nazwa czyli:
        //                   ogniwo3.nazwa

        // Właściwie dlaczego łańcuch ma nie być zamknięty?
        System.out.println("Laczymy ogniwo 3 z pierwszym.");
        ogniwo3.nastepne = ogniwo1;

        System.out.println("Jakie jest teraz piate ogniwo:");
        System.out.println(ogniwo1.nastepne.nastepne.nastepne.nastepne.nazwa);

    }

}
