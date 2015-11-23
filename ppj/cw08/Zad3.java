public class Zad3 {

    public static void main(String[] args) {

        int    i = 10;
        float  f = 10;
        char   c = 10;
        byte   b = 10;
        double d = 10;

        MethodCourier m = new MethodCourier();

        // To wszystko skonwertuje się automatycznie do int lub float
        // a następnie uruchomi się odpowiednia metoda dla int lub float:
        System.out.println("--- Automatyczne konwersje:");
        System.out.print("int:\t");    m.setValue( i );
        System.out.print("float:\t");  m.setValue( f );
        System.out.print("char:\t");   m.setValue( c );
        System.out.print("byte:\t");   m.setValue( b );

        // To nie zadziała bo double nie można skonwertować do
        // ani int ani float bez potencjalnej straty precyzji:
        // System.out.print("double:\t"); m.setValue(d);

        // Można zrobić ręcznie konwersję z double do float:
        System.out.println("--- Ręczne konwersje:");
        System.out.print("(float)double:\t"); m.setValue( (float)d );

        // Można też zrobić ręcznie konwersję z double do int:
        System.out.print("(int)double:\t"); m.setValue( (int)d );

        // To jest double bez konwersji i bez utraty precyzji:
        System.out.println("--- Oryginalna wartość double:");
        System.out.println("double:\t" + d);

    }
}

class MethodCourier {
    void setValue (int n) {
        System.out.println("int:\t" + n);
    }
    void setValue (float n) {
        System.out.println("float:\t" + n);
    }
}
