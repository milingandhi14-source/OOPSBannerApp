/*
 * OOPSBannerApp - UC6 Final Version
 * Demonstrates UC1 to UC6 concepts
 * UC1: Print OOPS concepts
 * UC3: String.join()
 * UC4: Array + Loop
 * UC5: Array Initialization
 * UC6: Static helper methods for characters
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC1 Content
        System.out.println("Welcome to OOPSBanner application");
        System.out.println("OOPS Concepts:");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. Abstraction");
        System.out.println();

        // Get character patterns
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Print banner using loop
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", O[i], O[i], P[i], S[i]));
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[] {
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