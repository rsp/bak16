public class Getter01 {

    public static void main(String[] args) {

        Klasa obiekt = new Klasa();

        // to nie zadziała - bo zmienna jest prywatna:
        // System.out.println( obiekt.zmienna );

        // to zadziała - bo metoda jest publiczna:
        System.out.println( obiekt.getZmienna() );

    }

}

class Klasa {

    // prywatna zmienna
    // nie można się dostać do obiekt.zmienna z innej klasy
    private int zmienna = 10;

    // publiczna metoda
    // można wywołać obiekt.getZmienna() z innej klasy
    // a ta metoda ma dostęp do prywatnej zmiennej swojej własnej klasy
    public int getZmienna() {
        return zmienna;
    }

}
