////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int n) {
        if (n < 1 || n > 3) {
            throw new IllegalArgumentException("Numero fuori range (1-3)");
        }
        
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "I";
        }
        return result;
    }
}