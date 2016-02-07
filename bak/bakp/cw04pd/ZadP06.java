
public class ZadP06 {

    public static void main(String[] args) {

        int n = 8;

        int p = 1;
        for (int i = 1; i <= n; p *= i++);
        
        System.out.println(p);

    }

}

