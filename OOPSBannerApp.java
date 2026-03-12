/*
 * OOPSBannerApp – Final Version UC1 to UC8
 * UC8 uses HashMap to store character patterns and render banner
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC1: Intro text
        System.out.println("Welcome to OOPSBanner application");
        System.out.println("OOPS Concepts:");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. Abstraction");
        System.out.println();

        // Create HashMap for character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}