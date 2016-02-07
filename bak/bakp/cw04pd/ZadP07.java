
public class ZadP07 {

    public static void main(String[] args) {

        int w = 3, k = 5;

        for (int i = 1; i <= w * k; i++)
            System.out.print(i % k == 0 ? "*\n" : "*");

    }

}

