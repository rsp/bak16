public class Zad3 {

    public static void main(String[] args) {

        char   c = 'A';  // znak
        byte   b = 111;  // bajt (liczba całkowita od -128 do 127)
        int    i = 2222; // int (liczba całkowita od ok. minus do plus 2 miliardy)
        float  f = 3.33333333333333333333f; // ułamek z "f" na końcu oznacza float
        double d = 4.44444444444444444444;  // ułamek bez "f" na końcu to double

        // double się nazywa double bo zajmuje w pamięci 2 razy tyle co float
        // i ma dzięki temu większą precyzję (więcej miejsc po przecinku)

        // tworzymy obiekt klasy MethodCourier po to, żebyśmy mogli wywoływać metody:
        MethodCourier m = new MethodCourier();

        // Obiekty klasy MethodCourier (zdefiniowanej niżej) mają
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

        System.out.print("wywolana metoda(int)\t");
        m.setValue( i );

        System.out.print("wywolana metoda(float)\t");
        m.setValue( f );

        System.out.print("wywolana metoda(char)\t");
        m.setValue( c );

        System.out.print("wywolana metoda(byte)\t");
        m.setValue( b );

        // To nie zadziała bo double nie można skonwertować do
        // ani int ani float bez potencjalnej straty precyzji:
        // System.out.print("wywolana metoda(double)\t");
        // m.setValue(d);

        // Można zrobić ręcznie konwersję z double do float
        // ze stratą precyzji:
        System.out.println("--- Ręczne konwersje:");
        System.out.print("wywolana metoda((float)double)\t");
        m.setValue( (float)d );

        // Można też zrobić ręcznie konwersję z double do int:
        // z jeszcze większą stratą precyzji:
        System.out.print("wywolana metoda((int)double)\t");
        m.setValue( (int)d );

        // To jest nasza wartość double bez konwersji i bez utraty precyzji:
        System.out.println("--- Oryginalna wartość double:");
        System.out.println("double:\t" + d);

    }
}

class MethodCourier {

    // metoda setValue w wersji obsługującej argument typu int:
    void setValue (int n) {
        System.out.println("wybrana metoda(int):\t" + n);
    }

    // metoda setValue w wersji obsługującej argument typu float:
    void setValue (float n) {
        System.out.println("wybrana metoda(float):\t" + n);
    }

}
