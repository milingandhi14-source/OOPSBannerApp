/*
 * OOPSBannerApp UC5 – Array Initialization
 * Declare and initialize the array in a single statement
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC1 Information
        System.out.println("Welcome to OOPSBanner application");
        System.out.println("OOPS Concepts:");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. Abstraction");

        System.out.println();

        // UC5 Implementation
        String[] lines = {
            String.join(" ", " *** ", " *** ", " **** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "**** ", " ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", "*   *", "*   *", "*     ", "*   * "),
            String.join(" ", " *** ", " *** ", "*     ", " ***  ")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}