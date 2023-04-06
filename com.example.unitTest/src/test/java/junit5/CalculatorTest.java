package junit5;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.stream.Stream;

class CalculatorTest {
    private Calculator calculator;
    private Calculator calculatorNull;
    private static Calculator calculatorStatic;

    @BeforeAll
    public static void beforeAllTest(){
        calculatorStatic = new Calculator();
        System.out.println("____@BeforeAll -> beforeAllTest()");
    }

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
        System.out.println("____@BeforeEach -> setUp()");
    }

    @AfterAll
    public static void afterAllTest(){
        calculatorStatic = null;
        System.out.println("____@AfterAll -> afterAllTest()");
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
        System.out.println("____@AfterEach -> setUp()");
    }

    @Test
    public void calculatorNotNullTest(){
        assertNotNull(calculator, "Calculator debe ser null");
        assertNotNull(calculatorStatic, "CalculatorStatic debe ser null");
        System.out.println("____@Test -> calculatorNotNullTest()");
    }

    @Test
    public void calculatorNullTest(){
        assertNull(calculatorNull);
        System.out.println("____@Test -> calculatorNullTest()");
    }

    @Test
    public void addAssertTest(){
        //1.- SetUp
        int resultadoEsperado = 30;
        int resultadoActual;
        //2.- Action
        resultadoActual = calculator.add(10,20);
        //3.- Assesrt
        assertEquals(resultadoEsperado,resultadoActual,"Error");
        System.out.println("____@Test -> addAssertTest()");
    }

    @Test
    public void addTest(){
        assertEquals(30, calculator.add(10,20));
    }

    @Test
    public void assertTypesTest(){
        assertTrue(1 == 1);
        //assertTrue(1 == 2); // no pasa

        assertNull(calculatorNull);
        assertNotNull(calculator);

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = calculator1;

        assertSame(calculator1, calculator3);
        //assertSame(calculator1, calculator2); // no pasa

        assertNotSame(calculator1, calculator2);

        assertEquals("alberto", "alberto");
        //assertEquals("alberto", "son", "fallo el metodo string"); // no pasa

        assertEquals(1, 1.4, 0.5);
        //assertEquals(1, 1.6, 0.5); // no pasa
    }

    @Test
    public void addValidInputValidExpectedTest(){
        assertEquals(11, calculator.add(7,4));
    }

    @Test
    public void subtractValidInputValidExpectedTest(){
        assertEquals(11, calculator.subtract(15,4));
    }

    @Test
    public void subtractValidInputValidNegativeResultExpectedTest(){
        assertEquals(-10, calculator.subtract(10,20));
    }

    @Test
    public void divideValidInputValidResultExpectedTest(){
        assertEquals(5, calculator.divide(100,20));
    }

    @Disabled
    @Test
    public void divideInvalidInputTest(){
        fail("fallo detectado manualmente");
        calculator.divide(100,0);
    }

    @Disabled
    @Test
    public void divideInvalidInputExpectedExceptionTest(){
        assertThrows(ArithmeticException.class, ()->calculator.divideByZero(2,0), "No se puede dividir por cero");
    }

    @Disabled("Disabled until bug 125 resolved")
    @Test
    public void divideInvalidInputDisabledTest(){
        assertEquals(2, calculator.divide(5,0));
    }

    @Test
    @DisplayName("Metodo Dividir -> Funciona")
    public void divideInvalidInputNameTest(){
        assertEquals(5, calculator.divide(10,2));
    }

    @Test
    public void addAssertAllTest(){
        assertAll(
                ()->assertEquals(3, calculator.add(1,2)),
                ()->assertEquals(20, calculator.add(10,10)),
                ()->assertEquals(2, calculator.add(1,1))
        );
    }

    @Nested
    class addTest{
        @Test
        public void addPositiveText(){
            assertEquals(30, calculator.add(15,15));
        }

        @Test
        public void addNegativeText(){
            assertEquals(-30, calculator.add(-15,-15));
        }

        @Test
        public void addZeroText(){
            assertEquals(0, calculator.add(0,0));
        }
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum{2}")
    @MethodSource("addProviderData")
    public void addParameterizedText(int a, int b, int sum){
        assertEquals(sum, calculator.add(a,b));
    }

    private static Stream<Arguments> addProviderData(){
        return Stream.of(
          Arguments.of(6,2,8),
          Arguments.of(-6,-2,-8),
          Arguments.of(6,-2,4),
          Arguments.of(-6,2,-4),
          Arguments.of(6,0,6)
        );
    }

    @Test
    public void timeOutTest(){
        assertTimeout(Duration.ofMillis(500), () -> {
            calculator.longTaskOperation();
        });
    }

}