class Ogniwo {

    // zmienne (czyli pola) obiektów klasy Ogniwo:

    // każde ogniwo może mieć jakąś nazwę
    // zmienna "nazwa" typu String:
    String nazwa;

    // oraz mieć połączenie z następnym ogniwem w łańcuchu
    // zmienna "nastepne" typu Ogniwo:
    Ogniwo nastepne;

}

public class Lista01 {

    public static void main(String[] args) {

        System.out.println("--- Tworzymy nowe ogniwa i nadajemy im nazwy:");

        // tworzymy w naszej metodzie main() nową zmienną "ogniwo1" typu Ogniwo:
        Ogniwo ogniwo1;
        // i zapisujemy w niej nowy obiekt klasy Ogniwo:
        ogniwo1 = new Ogniwo();
        // zmieniamy jego wewnętrzną zmienną "nazwa" - każdy obiekt ma swoją:
        ogniwo1.nazwa = "Pierwsze ogniwo";

        // teraz możemy odwoływać się do tej zmiennej obiektu ogniwo1
        // jako ogniwo1.nazwa:
        System.out.println("Stworzylismy ogniwo1 o nazwie " + ogniwo1.nazwa);

        // tym razem w jednej linijce tworzymy nową zmienną "ogniwo2" typu Ogniwo
        // i zapisujemy w niej nowy obiekt klasy Ogniwo:
        Ogniwo ogniwo2 = new Ogniwo();
        // ale to jest to samo co gdybyśmy napisali najpierw:
        //    Ogniwo ogniwo2;
        // a potem:
        //    ogniwo2 = new Ogniwo();

        // zapisujemy napis "Drugie ogniwo" w jego zmiennej "nazwa"
        // która jest niezależna od takiej samej zmiennej pierwszego obiektu:
        ogniwo2.nazwa = "Drugie ogniwo";

        // teraz możemy odwoływać się do tej zmiennej obiektu ogniwo2
        // jako ogniwo2.nazwa - tak samo jak z obiektem ogniwo1:
        System.out.println("Stworzylismy ogniwo2 o nazwie " + ogniwo2.nazwa);

        // i trzeci obiekt typu Ogniwo - zapisany w nowej zmiennej typu Ogniwo,
        // z kolejną nazwą:
        Ogniwo ogniwo3 = new Ogniwo();
        ogniwo3.nazwa = "Trzecie ogniwo";
        System.out.println("Stworzylismy ogniwo3 o nazwie " + ogniwo3.nazwa);

        System.out.println("--- Laczymy ze soba ogniwa:");

        // zapisujemy obiekt, który znajduje się w naszej zmiennej "ogniwo2",
        // w zmiennej "nastepne" obiektu "ogniwo1" żeby obiekt "ogniwo1"
        // wiedział jakie jest jego następne ogniwo:
        System.out.println("Laczymy pierwsze ogniwo z drugim.");
        ogniwo1.nastepne = ogniwo2;

        // podobnie ze zmienną ogniwo3, którą zapisujemy w zmiennej "następne"
        // tym razem obiektu ogniwo2:
        System.out.println("Laczymy drugie ogniwo z trzecim.");
        ogniwo2.nastepne = ogniwo3;

        // w zmiennej następne obiektu ogniwo3 zapisujemy wartość null (czyli brak wartości)
        // żeby pokazać, że to ogniwo jest ostatnie i nie ma już następnego:
        System.out.println("Ustalamy, ze trzecie nie ma juz nastepnego.");
        // to jest niepotrzebne bo wartość domyślna to null ale nie zaszkodzi:
        ogniwo3.nastepne = null;

        // teraz możemy się odwoływać do pól (czyli zmiennych) wszystkich tych obiektów
        // czyli np. ogniwo3.nazwa to jakiś łańcuch znaków (String)
        // a ogniwo1.nastepne to obiekt, który został wcześniej zapisany
        // w polu "nastepne" obiektu ongiwo1.
        // Skoro ogniwo1.nastepne to jest jakiś obiekt klasy Ogniwo
        // to on też ma jakąś nazwę: ogniwo1.nastepne.nazwa
        // oraz kolejne następne ogniwo: ogniwo1.nastepne.nastepne

        System.out.println("Jaka jest nazwa ogniwa nastepnego po nr 1:");
        System.out.println(ogniwo1.nastepne.nazwa);

        // ogniwo1.nastepne to ogniwo2 (bo takie tam zapisaliśmy)
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

        // Jeśli w polu "nastepne" ostatniego obiektu w naszym łańcuchu ogniw
        // zapiszemy pierwsze ogniwo, to łańcuch będzie zamknięty i będziemy mogli
        // poruszać się po nim w nieskończoność - tzn. następne ogniwo po trzecim
        // to będzie znów pierwsze - a po nim następne to drugie itd.

        System.out.println("Laczymy ogniwo 3 z pierwszym.");
        ogniwo3.nastepne = ogniwo1;

        // Teraz jeśli po trzecim ogniwie jest znów pierwsze, to po nim jest drugie itp.

        System.out.println("Jakie jest teraz piate ogniwo:");
        System.out.println(ogniwo1.nastepne.nastepne.nastepne.nastepne.nazwa);

        System.out.println("Teraz usuwamy drugie ogniwo z łańcucha.");
        // Wcześniej to drugie było zapisane jako "nastepne" w pierwszym
        // ale jak usuniemy to ogniwo to chcemy, żeby następnym dla pierwszego
        // stało się to jeszcze o jedno dalej:
        ogniwo1.nastepne = ogniwo1.nastepne.nastepne;

        // Teraz jaka jest nazwa nastepnego po pierwszym:
        System.out.println("Jaka jest nazwa ogniwa nastepnego po nr 1:");
        System.out.println(ogniwo1.nastepne.nazwa);
        // (wychodzi trzecie ogniwo bo drugiego już nie ma)

    }

}
