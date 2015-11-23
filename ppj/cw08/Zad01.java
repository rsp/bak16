public class Zad1 {

    static int fib(int n) {
        return n <= 2 ? n : fib(n-1) + fib(n-2);
    }

    // taki zapis:

    //     return WARUNEK ? A : B;

    // oznacza to samo co:

    //     if (WARUNEK)
    //         return A;
    //     else
    //         return B;

    // zamiast tego można napisać:

    // static int fib(int n) {
    //     if (n <= 2)
    //         return n;
    //     else
    //         return fib(n-1) + fib(n-2);
    // }

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++)
            System.out.format( "%3d: %5d\n", i, fib(i) );

    }

    // System.out.format to taki mądrzejszy System.out.print
    // mówi się mu najpierw jak ma wyświetlić - np. "%3d %5d\n"
    // a potem co ma wyswietlić - np. a, b

    // "%3d" oznacza liczbę dziesiętną (d) na szerokość 3 znaków
    // dwukropek i spacja to dwukropek i spacja wyświetlone normalnie
    // "%5d" oznacza liczbę dziesiętną (d) na szerokość 5 znaków
    // "\n" to znak nowej linnii - jak System.out.println();

    // Liczby wyświetlane w ten sposób są równane do prawej i
    // ładnie wyglądają. Zamiast tego można napisać prościej:

        // int n = 2;
        // for (int i = 0; i < 20; i++)
        //     System.out.println( i + ": " + fib(i) );

}
