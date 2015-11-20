public class Loops01 {

    public static void main(String[] args) {

        char[] t = {'a', 'b', 'c'};

        System.out.println("Zwykła pętla:");

        for (int i = 0; i < t.length; i++)
            System.out.println( t[i] );

        System.out.println("Prostsza pętla:");

        for (char c : t)
            System.out.println( c );

    }

}
