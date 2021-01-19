package main.exercice6;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] argv) {
        System.out.println("\n¤ ¤ ¤ isDigit ¤ ¤ ¤\n");
        System.out.println("8   isDigit ? " + isDigit("8"));
        System.out.println("a   isDigit ? " + isDigit("a"));
        System.out.println("77  isDigit ? " + isDigit("77"));
        System.out.println("77  isDigitFull ? " + isDigitFull("77"));
        System.out.println("777 isDigitFull ? " + isDigitFull("777"));
        System.out.println("7a7 isDigitFull ? " + isDigitFull("7a7"));

        System.out.println("\n¤ ¤ ¤ isPin ¤ ¤ ¤ (digits, 4 to 6 length)\n");
        System.out.println("123      isPin ? " + isPin("123"));
        System.out.println("1234     isPin ? " + isPin("1234"));
        System.out.println("12345    isPin ? " + isPin("12345"));
        System.out.println("123456   isPin ? " + isPin("123456"));
        System.out.println("1234567  isPin ? " + isPin("1234567"));
        System.out.println("a123     isPin ? " + isPin("a123"));
        System.out.println("1a23     isPin ? " + isPin("1a23"));
        System.out.println("aaa123   isPin ? " + isPin("aaa123"));

        System.out.println("\n¤ ¤ ¤ isUsername ¤ ¤ ¤ (lower letters, digits, underscore, 4 to 16 length) \n");
        System.out.println("123               isUsername ? " + isUsername("123"));
        System.out.println("1234              isUsername ? " + isUsername("1234"));
        System.out.println("1234567890123456  isUsername ? " + isUsername("1234567890123456"));
        System.out.println("12345678901234567 isUsername ? " + isUsername("12345678901234567"));
        System.out.println("abd123            isUsername ? " + isUsername("abd123"));
        System.out.println("abd_123           isUsername ? " + isUsername("abd_123"));
        System.out.println("abD_123           isUsername ? " + isUsername("abD_123"));

        System.out.println("\n¤ ¤ ¤ isHour ¤ ¤ ¤ (HHhMM) \n");
        System.out.println(" 0h21   isHour ? " + isHour("0h21"));
        System.out.println("a0h21   isHour ? " + isHour("a0h21"));
        System.out.println(" 9h21   isHour ? " + isHour("9h21"));
        System.out.println("02h21   isHour ? " + isHour("02h21"));
        System.out.println("23h21   isHour ? " + isHour("23h21"));
        System.out.println("24h21   isHour ? " + isHour("24h21"));
        System.out.println("25h21   isHour ? " + isHour("25h21"));
        System.out.println("35h21   isHour ? " + isHour("35h21"));
        System.out.println("13h21   isHour ? " + isHour("13h21"));
        System.out.println("13h60   isHour ? " + isHour("13h60"));
        System.out.println("13h78   isHour ? " + isHour("13h78"));
        System.out.println("13:21   isHour ? " + isHour("13:21"));
        System.out.println("a02h21  isHour ? " + isHour("a02h21"));

        System.out.println("\n¤ ¤ ¤ isIPv4 ¤ ¤ ¤ ([0-255].[0-255].[0-255].[0-255]) \n");
        System.out.println("0.0.0.0        isIPv4 ? " + isIPv4("0.0.0.0"));
        System.out.println("0.199.210.1    isIPv4 ? " + isIPv4("0.199.210.1"));
        System.out.println("255.243.1.76   isIPv4 ? " + isIPv4("255.243.1.76"));
        System.out.println("255.243.1.76.5 isIPv4 ? " + isIPv4("255.243.1.76.5"));
        System.out.println("10.10.12.13.5  isIPv4 ? " + isIPv4("10.10.12.13.5"));
        System.out.println("255.199.210.1  isIPv4 ? " + isIPv4("255.199.210.1"));
        System.out.println("256.199.210.1  isIPv4 ? " + isIPv4("256.199.210.1"));
        System.out.println("999.199.210.1  isIPv4 ? " + isIPv4("999.199.210.1"));

        System.out.println("\n¤ ¤ ¤ getCentsOfPrice ¤ ¤ ¤ (1,23€ | 1€23) \n");
        System.out.println("   0,233€ -> " + getCentsOfPrice("0,233€"));
        System.out.println("   0,23€  -> " + getCentsOfPrice("0,23€"));
        System.out.println("   1,03€  -> " + getCentsOfPrice("1,03€"));
        System.out.println("  11,93€  -> " + getCentsOfPrice("11,93€"));
        System.out.println("1155,99€  -> " + getCentsOfPrice("1155,99€"));
        System.out.println("   0€233  -> " + getCentsOfPrice("0€233"));
        System.out.println("   0€23   -> " + getCentsOfPrice("0€23"));
        System.out.println("   1€03   -> " + getCentsOfPrice("1€03"));
        System.out.println("  11€93   -> " + getCentsOfPrice("11€93"));
        System.out.println("1155€99   -> " + getCentsOfPrice("1155€99"));

        System.out.println("\n¤ ¤ ¤ censure ¤ ¤ ¤\n");
        String[] censures = new String[2];
        censures[0] = "ananas";
        censures[1] = "pizza";
        String[] sentences = new String[4];
        sentences[0] = "J’ai mange une pizza ananas.";
        sentences[1] = "J’adore la pizza à l’ananas.";
        sentences[2] = "Pizza et ananas sont un super mélange.";
        sentences[3] = "L'eau ça mouille. J’adore la pizza à l’ananas. Les chats c’est fun.";
        for (String sentence : sentences) {
            System.out.println(sentence + " -> " + textCensured(sentence, censures));
        }

    }

    private static boolean isDigit(String value) {
        return value.matches("[0-9]");
    }

    private static boolean isDigitFull(String value) {
        return value.matches("^[0-9]+$");
    }

    private static boolean isPin(String value) {
        return value.matches("^[0-9]{4,6}$");
    }

    private static boolean isUsername(String value) {
        // return value.matches("^([0-9]|[a-z]|_){4,16}$");
        return value.matches("^[0-9a-z_]{4,16}$");
    }

    private static boolean isHour(String value) {
        // return value.matches("^(([0-1]?[0-9])|(2[0-3]))h[0-5][0-9]$");
        return value.matches("^(([0-9])|([0-1][0-9])|(2[0-3]))h([0-5][0-9])$");
    }

    private static boolean isIPv4(String value) {
        return value.matches("^((([0-9])|(([0-1]?[0-9]{2})|(2[0-4][0-9])|25[0-5]))(\\.)){3}(([0-9])|(([0-1]?[0-9]{2})|(2[0-4][0-9])|25[0-5]))$");
    }

    private static String getCentsOfPrice(String value) {
        if (value.matches("^(\\d)+,\\d\\d€$")) {
            return value.split(",")[1].substring(0, 2);
        }
        else if (value.matches("^(\\d)+€\\d\\d$")) {
            return value.split("€")[1];
        }
        else {
            return null;
        }
    }

    private static String textCensured(String text, String[] censures) {
        String[] sentences = text.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            for (String censure: censures) {
                if (sentences[i].contains(censure)) {
                    sentences[i] = "***";
                    break;
                }
            }
        }
        return String.join(".", sentences);
    }
}
