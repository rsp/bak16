public class Zad03 {

    public static void main(String[] args) {

        char   c = 'A';  // znak
        byte   b = 111;  // bajt (liczba całkowita od -128 do 127)
        int    i = 2222; // int (liczba całkowita od ok. minus do plus 2 miliardy)
        float  f = 3.33333333333333333333f; // ułamek z "f" na końcu oznacza float
        double d = 4.44444444444444444444;  // ułamek bez "f" na końcu to double

        // double się nazywa double bo zajmuje w pamięci 2 razy tyle co float
        // i ma dzięki temu większą precyzję (więcej miejsc po przecinku)

        // tworzymy obiekt klasy Wyswietlacz po to, żebyśmy mogli wywoływać metody:
        Wyswietlacz w = new Wyswietlacz();

        // Obiekty klasy Wyswietlacz (zdefiniowanej niżej) mają
        // dwie metody o tej samej nazwie ale o różnych typach argumentów (int i float).

        // To która wersja się uruchomi zależy od tego z jakim argumentem ją wywołamy.
        // Jeśli wywołamy z argumentem int to uruchomi się wersja int.
        // Jeśli wywołamy z argumentem float to uruchomi się wersja float.
        // Jeśli wywołamy z czymś innym niż int lub float (np. byte albo double)
        // to wtedy Java sprawdzi czy ten nasz typ da się zamienić bez straty na
        // jeden z typów obsługiwanych przez nasze metody (czyli na int lub float)
        // i jeśli się da to uruchomi odpowiednią wersję metody a jeśli się nie da
        // to będziemy mieli błąd o potencjalnej utracie precyzji.

        // To wszystko skonwertuje się automatycznie do int lub float
        // a następnie uruchomi się odpowiednia metoda dla int lub float:
        System.out.println("--- Automatyczne konwersje:");

        System.out.print("wywolane wyswietl(int) -> ");
        w.wyswietl( i );

        System.out.print("wywolane wyswietl(float) -> ");
        w.wyswietl( f );

        System.out.print("wywolane wyswietl(char) -> ");
        w.wyswietl( c );

        System.out.print("wywolane wyswietl(byte) -> ");
        w.wyswietl( b );

        // To nie zadziała bo double nie można skonwertować do
        // ani int ani float bez potencjalnej straty precyzji:
        // System.out.print("wywolane wyswietl(double) -> ");
        // w.wyswietl(d);

        // Można zrobić ręcznie konwersję z double do float
        // ze stratą precyzji:
        System.out.println("--- Ręczne konwersje:");
        System.out.print("wywolane wyswietl((float)double) -> ");
        w.wyswietl( (float)d );

        // Można też zrobić ręcznie konwersję z double do int:
        // z jeszcze większą stratą precyzji:
        System.out.print("wywolane wyswietl((int)double) -> ");
        w.wyswietl( (int)d );

        // To jest nasza wartość double bez konwersji i bez utraty precyzji:
        System.out.println("--- Oryginalna wartość double:");
        System.out.println("double:\t" + d);

    }
}

class Wyswietlacz {

    // metoda wyswietl w wersji obsługującej argument typu int:
    void wyswietl (int n) {
        System.out.println("zadzialalo wyswietl(int): " + n);
    }

    // metoda wyswietl w wersji obsługującej argument typu float:
    void wyswietl (float n) {
        System.out.println("zadzialalo wyswietl(float): " + n);
    }

}
