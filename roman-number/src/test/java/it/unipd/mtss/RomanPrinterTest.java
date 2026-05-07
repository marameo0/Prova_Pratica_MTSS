////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
//Test legali
    @Test
    public void testPrint_NumberOne_ReturnsAsciiI() {
        String expected =
            "  _____  \n" +
            " |_   _| \n" +
            "   | |   \n" +
            "   | |   \n" +
            "  _| |_  \n" +
            " |_____| \n";
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrint_NumberTwo_ReturnsAsciiII() {
        String expected =
            "  _____    _____  \n" +
            " |_   _|  |_   _| \n" +
            "   | |      | |   \n" +
            "   | |      | |   \n" +
            "  _| |_    _| |_  \n" +
            " |_____|  |_____| \n";
        assertEquals(expected, RomanPrinter.print(2));
    }

    @Test
    public void testPrint_NumberThree_ReturnsAsciiIII() {
        String expected =
            "  _____    _____    _____  \n" +
            " |_   _|  |_   _|  |_   _| \n" +
            "   | |      | |      | |   \n" +
            "   | |      | |      | |   \n" +
            "  _| |_    _| |_    _| |_  \n" +
            " |_____|  |_____|  |_____| \n";
        assertEquals(expected, RomanPrinter.print(3));
    }

    @Test
    public void testPrint_NumberFour_ReturnsAsciiIV() {
        String expected =
            "  _____  __        __\n" +
            " |_   _| \\ \\      / /\n" +
            "   | |    \\ \\    / / \n" +
            "   | |     \\ \\  / /  \n" +
            "  _| |_     \\ \\/ /   \n" +
            " |_____|     \\__/    \n";
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrint_NumberFive_ReturnsAsciiV() {
        String expected =
            "__        __\n" +
            "\\ \\      / /\n" +
            " \\ \\    / / \n" +
            "  \\ \\  / /  \n" +
            "   \\ \\/ /   \n" +
            "    \\__/    \n";
        assertEquals(expected, RomanPrinter.print(5));
    }
//Test illegali
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NumberZero_ThrowsException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NumberEleven_ThrowsException() {
        RomanPrinter.print(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NegativeNumber_ThrowsException() {
        RomanPrinter.print(-1);
    }
}