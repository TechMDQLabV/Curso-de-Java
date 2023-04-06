package mokito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidNumberTest {

    private ValidNumber validNumber;

    @BeforeEach
    public void setUp(){
        validNumber = new ValidNumber();
    }

    @AfterEach
    public void tearDown(){
        validNumber = null;
    }

    @Test
    public void checkTest(){
        assertEquals(true, validNumber.check(5));
    }

    @Test
    public void checkNegativeTest(){
        assertEquals(false, validNumber.check(-5));
    }

    @Test
    public void checkStringTest(){
        assertEquals(false, validNumber.check("algo"));
    }

    @Test
    public void checkZeroTest(){
        assertEquals(true, validNumber.checkZero(-56));
    }

    @Test
    public void checkZeroStringTest(){
        assertEquals(false, validNumber.checkZero("algo"));
    }

    @Test
    public void checkZeroZeroTest(){
        assertThrows(ArithmeticException.class, ()->validNumber.checkZero(0));
    }

    @Test
    public void doubleToIntTest(){
        assertEquals(9,validNumber.doubleToInt(9.999));
    }

    @Test
    public void doubleToIntErrorTest(){
        assertEquals(0,validNumber.doubleToInt("9.999"));
    }
}