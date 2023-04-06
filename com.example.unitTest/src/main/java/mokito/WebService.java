package mokito;

import javax.security.auth.callback.Callback;

public class WebService {

    public void login(String user, String pass, CallBack callBack){
        if(checkLogin(user, pass)){
            callBack.onSuccess("Usuario Correcto");
        }else{
            callBack.onFail("Usuario o Contraseña Incorrecto");
        }
    }

    public boolean checkLogin(String user, String pass){
        boolean login = false;
        if(user.equals("Sergio") && pass.equals("1234")){
            login = true;
        }
        return login;
    }

}
