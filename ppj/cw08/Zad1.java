public class Zad1 {

    static int fib(int n) {
        return n <= 2 ? n : fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        int n = 2;
        for (int i = 0; i < 20; i++)
            System.out.format("%3d %5d\n", i, fib(i));

    }

}
