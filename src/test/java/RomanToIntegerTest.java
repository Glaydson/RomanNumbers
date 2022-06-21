import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger= new RomanToInteger();

    @BeforeEach
    void setUp() {
    }

    @Test
    void romanToInt3() throws Exception{
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void romanToInt58() throws Exception{
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test()
    void romanToInt1994() throws Exception {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test()
    void romanToIntNull() throws Exception {
        assertThrows(Exception.class, () -> romanToInteger.romanToInt(null), "Null Roman Number is Invalid. Exception was expected.");
    }

    @Test()
    void romanToIntEmpty() throws Exception {
        assertThrows(Exception.class, () -> romanToInteger.romanToInt(" "), "Empty Roman Number is Invalid. Exception was expected.");
    }

    @Test()
    void romanToIntInvalidChar() throws Exception {
        assertThrows(Exception.class, () -> romanToInteger.romanToInt("IAII"), "The Roman Number Contains an Invalid Character. Exception was expected.");
    }

}