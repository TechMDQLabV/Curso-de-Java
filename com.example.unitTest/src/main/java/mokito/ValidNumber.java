package mokito;

public class ValidNumber {
    public ValidNumber(){};

    public boolean check(Object o){
        boolean ret = false;
        if(o instanceof Integer){
            if((Integer)o < 10 && (Integer)o >= 0){
                ret = true;
            }
        }
        return ret;
    }

    public boolean checkZero(Object o){
        boolean ret = false;
        if(o instanceof Integer){
            if((Integer)o == 0){
                throw new ArithmeticException("No podemos aceptar cero");
            }else{
                ret = true;
            }
        }
        return ret;
    }

    public int doubleToInt(Object o){
        if(o instanceof Double){
            return ((Double)o).intValue();
        }else{
            return 0;
        }
    }
}
