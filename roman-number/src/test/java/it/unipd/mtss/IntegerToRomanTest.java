////////////////////////////////////////////////////////////////////
// [DIANA] [GROSSELLE] [2137985]
// [VALENTINO NICOLA] [MILANI] [2147991]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
//Test legali
    @Test
    public void testConvert_NumberOne_ReturnsI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert_NumberTwo_ReturnsII() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvert_NumberThree_ReturnsIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

     @Test
    public void testConvert_NumberFour_ReturnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert_NumberFive_ReturnsV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }
    
    @Test
    public void testConvert_NumberNine_ReturnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_NumberTen_ReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }
//Test illegali
    @Test(expected = IllegalArgumentException.class)
    public void testConvert_NumberZero_ThrowsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_NumberEleven_ThrowsException() {
        IntegerToRoman.convert(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_NegativeNumber_ThrowsException() {
        IntegerToRoman.convert(-1);
    }
}