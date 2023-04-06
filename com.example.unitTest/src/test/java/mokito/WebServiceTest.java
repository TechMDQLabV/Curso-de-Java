package mokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class WebServiceTest {

    private WebService webService;
    @Mock
    private CallBack callBack;

    @BeforeEach
    public void setUp(){
        webService = new WebService();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkLoginTest(){
        assertTrue(webService.checkLogin("Sergio","1234"));
    }

    @Test
    public void checkLoginErrorTest(){
        assertFalse(webService.checkLogin("Juan","1234"));
    }

    @Test
    public void loginTest(){
        webService.login("Sergio","1234",callBack);
        verify(callBack).onSuccess("Usuario Correcto");
    }

    @Test
    public void loginErrorTest(){
        webService.login("Juan","1234d",callBack);
        verify(callBack).onFail("Usuario o Contraseña Incorrecto");
    }
}