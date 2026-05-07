////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {5, 4, 1};

    private static final String[] SYMBOLS = {"V", "IV", "I"};

    // Gestisce il limete dei numeri
    public static String convert(int n) {
        if (n < 1 || n > 6) {
            throw new IllegalArgumentException(
                "Numero fuori range (1-6)");
        }

        StringBuilder result = new StringBuilder();
        int remaining = n;

        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return result.toString();
    }
}