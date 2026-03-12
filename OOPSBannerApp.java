public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to OOPSBanner application");
        System.out.println("OOPS Concepts:");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. Abstraction");

        System.out.println();

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", O[i], O[i], P[i], S[i]));
        }
    }

    public static String[] buildO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] buildP() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    public static String[] buildS() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }
}