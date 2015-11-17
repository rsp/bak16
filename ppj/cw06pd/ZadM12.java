public class ZadM12 {

    static char randASCII() {
        return (char)('a'+Math.random()*('z'-'a'+1));
    }

     static char randMore() {
        int i = 0;
        while (!Character.isLowerCase(i))
            i = (int)(Math.random()*0x250);
        return (char)i;
    }

    static char randAll() {
        int i = 0;
        while (!Character.isLowerCase(i))
            i = (int)(Math.random()*Character.MAX_VALUE);
        return (char)i;
    }

    public static void main(String[] args) {

        System.out.print("ASCII: ");
        for (int i = 0; i < 50; i++)
            System.out.print(randASCII());

        System.out.print("\nWiecej: ");
        for (int i = 0; i < 50; i++)
            System.out.print(randMore());

        System.out.print("\nWszystkie: ");
        for (int i = 0; i < 50; i++)
            System.out.print(randAll());

        System.out.println();

    }

}
