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
    @Test
    public void testPrint_NumberNine_ReturnsAsciiIX() {
        String expected =
            "  _____  __   __\n" +
            " |_   _| \\ \\ / /\n" +
            "   | |    \\ V / \n" +
            "   | |     > <  \n" +
            "  _| |_   / . \\ \n" +
            " |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrint_NumberTen_ReturnsAsciiX() {
        String expected =
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / . \\ \n" +
            "/_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    public void testPrint_NumberTwenty_ReturnsAsciiXX() {
        String expected =
            "__   ____   __\n" +
            "\\ \\ / /\\ \\ / /\n" +
            " \\ V /  \\ V / \n" +
            "  > <    > <  \n" +
            " / . \\  / . \\ \n" +
            "/_/ \\_\\/_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(20));
    }

    @Test
    public void testPrint_NumberForty_ReturnsAsciiXL() {
        String expected =
            "__   __ _       \n" +
            "\\ \\ / /| |      \n" +
            " \\ V / | |      \n" +
            "  > <  | |      \n" +
            " / . \\ | |____  \n" +
            "/_/ \\_\\|______| \n";
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    public void testPrint_NumberFifty_ReturnsAsciiL() {
        String expected =
            " _       \n" +
            "| |      \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            "|______| \n";

        assertEquals(expected, RomanPrinter.print(50));
    }

    @Test
    public void testPrint_NumberSixtyEight_ReturnsAsciiLXVIII() {
        String expected =
            " _       __   ____        __  _____    _____    _____  \n" +
            "| |      \\ \\ / /\\ \\      / / |_   _|  |_   _|  |_   _| \n" +
            "| |       \\ V /  \\ \\    / /    | |      | |      | |   \n" +
            "| |        > <    \\ \\  / /     | |      | |      | |   \n" +
            "| |____   / . \\    \\ \\/ /     _| |_    _| |_    _| |_  \n" +
            "|______| /_/ \\_\\    \\__/     |_____|  |_____|  |_____| \n";

        assertEquals(expected, RomanPrinter.print(68));
    }
    
    @Test
    public void testPrint_NumberNinety_ReturnsAsciiXC() {
        String expected =
            "__   __  _____  \n" +
            "\\ \\ / / / ____| \n" +
            " \\ V / | |      \n" +
            "  > <  | |      \n" +
            " / . \\ | |____  \n" +
            "/_/ \\_\\ \\_____| \n";

        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    public void testPrint_NumberOneHundred_ReturnsAsciiC() {
        String expected =
            "  _____  \n" +
            " / ____| \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            " \\_____| \n";

        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    public void testPrint_NumberThreeHundredFortySix_ReturnsAsciiCCCXLVI() {
        String expected =
            "  _____    _____    _____  __   __ _       __        __  _____  \n" +
            " / ____|  / ____|  / ____| \\ \\ / /| |      \\ \\      / / |_   _| \n" +
            "| |      | |      | |       \\ V / | |       \\ \\    / /    | |   \n" +
            "| |      | |      | |        > <  | |        \\ \\  / /     | |   \n" +
            "| |____  | |____  | |____   / . \\ | |____     \\ \\/ /     _| |_  \n" +
            " \\_____|  \\_____|  \\_____| /_/ \\_\\|______|     \\__/     |_____| \n";

        assertEquals(expected, RomanPrinter.print(346));
    }

    @Test
    public void testPrint_NumberFourHundred_ReturnsAsciiCD() {
        String expected =
            "  _____   _____   \n" +
            " / ____| |  __ \\  \n" +
            "| |      | |  | | \n" +
            "| |      | |  | | \n" +
            "| |____  | |__| | \n" +
            " \\_____| |_____/  \n";

        assertEquals(expected, RomanPrinter.print(400));
    }

    @Test
    public void testPrint_NumberFiveHundred_ReturnsAsciiD() {
        String expected =
            " _____   \n" +
            "|  __ \\  \n" +
            "| |  | | \n" +
            "| |  | | \n" +
            "| |__| | \n" +
            "|_____/  \n";

        assertEquals(expected, RomanPrinter.print(500));
    }

    @Test
    public void testPrint_NumberSixHundredFortyNine_ReturnsAsciiDCXLIX() {
        String expected =
            " _____     _____  __   __ _         _____  __   __\n" +
            "|  __ \\   / ____| \\ \\ / /| |       |_   _| \\ \\ / /\n" +
            "| |  | | | |       \\ V / | |         | |    \\ V / \n" +
            "| |  | | | |        > <  | |         | |     > <  \n" +
            "| |__| | | |____   / . \\ | |____    _| |_   / . \\ \n" +
            "|_____/   \\_____| /_/ \\_\\|______|  |_____| /_/ \\_\\\n";

        assertEquals(expected, RomanPrinter.print(649));
    }

    @Test
    public void testPrint_NumberNineHundred_ReturnsAsciiCM() {
        String expected =
            "  _____   __  __  \n" +
            " / ____| |  \\/  | \n" +
            "| |      | \\  / | \n" +
            "| |      | |\\/| | \n" +
            "| |____  | |  | | \n" +
            " \\_____| |_|  |_| \n";

        assertEquals(expected, RomanPrinter.print(900));
    }

    @Test
    public void testPrint_NumberOneThousand_ReturnsAsciiM() {
        String expected =
            " __  __  \n" +
            "|  \\/  | \n" +
            "| \\  / | \n" +
            "| |\\/| | \n" +
            "| |  | | \n" +
            "|_|  |_| \n";

        assertEquals(expected, RomanPrinter.print(1000));
    }

//Test illegali
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NumberZero_ThrowsException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NumberOneThousandSeven_ThrowsException() {
        RomanPrinter.print(1007);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NegativeNumber_ThrowsException() {
        RomanPrinter.print(-1);
    }
}