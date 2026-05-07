////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static final String[] SYMBOLS = {"C", "XC", "L", "XL", "X", "IX", "V", 
                                            "IV", "I"};

    // Gestisce il limite dei numeri
    public static String convert(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException(
                "Numero fuori range (1-50)");
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
   