////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    // ASCII art della lettera I
    private static final String[] ASCII_I = {
        "  _____  ",
        " |_   _| ",
        "   | |   ",
        "   | |   ",
        "  _| |_  ",
        " |_____| "
    };

    // ASCII art della lettera V
    private static final String[] ASCII_V = {
        "__        __",
        "\\ \\      / /",
        " \\ \\    / / ",
        "  \\ \\  / /  ",
        "   \\ \\/ /   ",
        "    \\__/    "
    };
    // ASCII art della lettera X
    private static final String[] ASCII_X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };
    // ASCII art della lettera L (50)
    private static final String[] ASCII_L = {
        " _       ",
        "| |      ",
        "| |      ",
        "| |      ",
        "| |____  ",
        "|______| "
    };
    // ASCII art della lettera C (100)
    private static final String[] ASCII_C = {
        "  _____  ",
        " / ____| ",
        "| |      ",
        "| |      ",
        "| |____  ",
        " \\_____| "
    };
    // ASCII art della lettera D (500)
    private static final String[] ASCII_D = {
        " _____   ",
        "|  __ \\  ",
        "| |  | | ",
        "| |  | | ",
        "| |__| | ",
        "|_____/  "
    };

    public static String print(int n) {
        return printAsciiArt(IntegerToRoman.convert(n));
    }

    // Costruisce la stringa finale affiancando le lettere riga x riga
     private static String printAsciiArt(String romanNumber) {
        int rows = 6;
        String[] lines = new String[rows];
        for (int i = 0; i < rows; i++) {
            lines[i] = "";
        }

        for (char c : romanNumber.toCharArray()) {
            String[] art = getAsciiArt(c);
            for (int i = 0; i < rows; i++) {
                lines[i] += art[i];
            }
        }

        String result = "";
        for (String line : lines) {
            result += line + "\n";
        }
        return result;
    }

    private static String[] getAsciiArt(char c) {
        switch (c) {
            case 'I': return ASCII_I;
            case 'V': return ASCII_V;
            case 'X': return ASCII_X;
            case 'L': return ASCII_L;
            case 'C': return ASCII_C;
            case 'D': return ASCII_D;
            default: throw new IllegalArgumentException(
                "Carattere non supportato: " + c);
        }
    }
}