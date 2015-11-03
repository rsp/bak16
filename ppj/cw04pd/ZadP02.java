
public class ZadP02 {

    public static void main(String[] args) {

        int n = 42;

        for (int i = 0; i < n; i++)
            if (i % 5 == 0 && i % 3 != 0)
                System.out.println(i);
    }

}

