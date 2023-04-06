package junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureCalculatorTest {
    private TemperatureCalculator temperatureCalculator;
    private TemperatureCalculator temperatureCalculatorNull;


    @BeforeEach
    public void setUp(){
        temperatureCalculator = new TemperatureCalculator();
        System.out.println("____@BeforeEach -> setUp()");
    }

    @AfterEach
    public void tearDown(){
        temperatureCalculator = null;
        System.out.println("____@AfterEach -> setUp()");
    }

    @Test
    public void setTemperatureCalculatorNotNullTest(){
        assertNotNull(temperatureCalculator, "Calculator debe ser null");
        System.out.println("____@Test -> temperatureCalculatorNotNullTest()");
    }

    @Test
    public void toFahrenheitTest(){
        assertEquals(89.6, temperatureCalculator.toFahrenheit(32),0.01);
    }
}