package mokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddTest {
    @InjectMocks
    private Add add;

    @Mock
    private ValidNumber validNumber;

    @Mock
    private Print print;

    @Captor
    private ArgumentCaptor<Integer> captor;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addTest(){
        when(validNumber.check(3)).thenReturn(true);
        boolean checkNumber = validNumber.check(3);
        assertEquals(true, checkNumber);
    }

    @Test
    public void addMockExceptionTest(){
         when(validNumber.checkZero(0)).thenThrow(new ArithmeticException("No podemos aceptar cero"));
         Exception exception = null;
         try{
             validNumber.checkZero(0);
         }catch(ArithmeticException e){
             exception = e;
         }
         assertNotNull(exception);
    }

    @Test
    public void addRealMethodTest(){
        when(validNumber.check(3)).thenCallRealMethod();
        assertEquals(true, validNumber.check(3));

        when(validNumber.check("3")).thenCallRealMethod();
        assertEquals(false, validNumber.check("3"));
    }

    @Test
    public void addDoubleToIntThenAnswerTest(){

    }

    @Test
    public void patterTest(){
        /// Arrange
        when(validNumber.check(4)).thenReturn(true);
        when(validNumber.check(5)).thenReturn(true);
        /// Act
        int result = add.add(4,5);
        /// Assert
        assertEquals(9,result);
    }

    @Test
    public void patterBDDTest(){
        /// Given
        given(validNumber.check(4)).willReturn(true);
        given(validNumber.check(5)).willReturn(true);
        /// When
        int result = add.add(4,5);
        /// Then
        assertEquals(9,result);
    }

    @Test
    public void argumentMatcherTest(){
        /// Given
        given(validNumber.check(anyInt())).willReturn(true);
        /// When
        int result = add.add(4,5);
        /// Then
        assertEquals(9,result);
    }

    @Test
    public void addPrint(){
        //Given
        given(validNumber.check(4)).willReturn(true);
        given(validNumber.check(5)).willReturn(true);
        //When
        add.addPrint(4,5);
        //Then
        verify(validNumber).check(4);
        //verify(validNumber, times(2)).check(4);
        verify(validNumber, never()).check(99);
        verify(validNumber, atLeast(1)).check(5);
        verify(validNumber, atMost(3)).check(5);

        verify(print).showMessage(9);
        verify(print, never()).showError();
    }

    @Test
    public void captorTest(){
        //Given
        given(validNumber.check(4)).willReturn(true);
        given(validNumber.check(5)).willReturn(true);
        //When
        add.addPrint(4,5);
        //Then
        verify(print).showMessage(captor.capture());
        assertEquals(captor.getValue().intValue(), 9);
    }

    @Spy
    List<String> spyList = new ArrayList<>();
    @Mock
    List<String> mockList = new ArrayList<>();

    @Test
    public void spyTest(){
        spyList.add("1");
        spyList.add("2");
        verify(spyList).add("1");
        verify(spyList).add("2");
        assertEquals(2, spyList.size());
    }

    @Test
    public void mockTest(){
        mockList.add("1");
        mockList.add("2");
        verify(mockList).add("1");
        verify(mockList).add("2");
        given(mockList.size()).willReturn(2);
        assertEquals(2, mockList.size());
    }
}