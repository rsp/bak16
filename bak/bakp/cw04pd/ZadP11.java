
public class ZadP11 {

    public static void main(String[] args) {

        int n = 123456;

        int s;
        for (s = 0; n > 0; n /= 10) s += n % 10;
        System.out.println(s % 2 == 0 ? "tak" : "nie");

    }

}

