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

    public static String print(int n) {
        return printAsciiArt(IntegerToRoman.convert(n));
    }

    // Costruisec la stringa finale affiancando le lettere riga x riga
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
            default: throw new IllegalArgumentException(
                "Carattere non supportato: " + c);
        }
    }
}