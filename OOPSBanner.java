/*
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 * This program prints OOPS in banner format using String.join()
 * instead of + operator for better memory efficiency.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", " *** ", " *** ", " **** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "**** ", " ***  "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "    * "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "*   * "));
        System.out.println(String.join(" ", " *** ", " *** ", "*     ", " ***  "));
    }
}