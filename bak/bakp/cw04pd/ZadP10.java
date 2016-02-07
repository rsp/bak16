
public class ZadP10 {

    public static void main(String[] args) {

        int n = 123456;

        System.out.println("bez petli: " + ((int)Math.log10(n)+1));

        int i;
        for (i = 0; n > 0; n /= 10) i++;
        System.out.println("petla: " + i);

    }

}

