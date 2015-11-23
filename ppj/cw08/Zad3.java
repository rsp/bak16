public class Zad3 {

    public static void main(String[] args) {

        int i; float f; char c; byte b; double d;
        d = f = i = c = 10; b = 10;

        MethodCourier m = new MethodCourier();

        System.out.print("int:\t");    m.setValue(i);
        System.out.print("float:\t");  m.setValue(f);
        System.out.print("char:\t");   m.setValue(c);
        System.out.print("byte:\t");   m.setValue(b);

        // System.out.print("double:\t"); m.setValue(d);

        // try { m.setValue(d); } catch (Exception e) {
        //  System.out.println("Error");
        // }
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
