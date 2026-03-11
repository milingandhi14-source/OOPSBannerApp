/*
 * OOPSBannerApp UC4 – Render OOPS Banner using Array & Loop
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

        // UC4 Implementation using Array + Loop
        String[] lines = new String[7];

        lines[0] = String.join(" ", " *** ", " *** ", " **** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", "**** ", " ***  ");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "*   * ");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " ***  ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}