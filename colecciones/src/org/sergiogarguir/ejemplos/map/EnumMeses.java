package org.sergiogarguir.ejemplos.map;

public interface EnumMeses {

    enum MesesEnum {
        ENERO("MES NUMERO 1", 1, "Texto"),
        FEBRERO("MES NUMERO 2", 2, "Texto"),
        MARZO("MES NUMERO 3", 3, "Texto"),
        ABRIL("MES NUMERO 4", 4, "Texto"),
        MAYO("MES NUMERO 5", 5, "Texto"),
        JUNIO("MES NUMERO 6", 6, "Texto"),
        JULIO("MES NUMERO 7", 7, "Texto"),
        AGOSTO("MES NUMERO 8", 8, "Texto"),
        SEPTIEMBRE("MES NUMERO 9", 9, "Texto"),
        OCTUBRE("MES NUMERO 10", 10, "Texto"),
        NOVIEMBRE("MES NUMERO 11", 11, "Texto"),
        DICIEMBRE("MES NUMERO 12", 12, "Texto");

        /*private final String mes;
        private final int numero;
        private final String text;
        */
        private final Mes mes = new Mes();

        MesesEnum(String mes, int numero, String text) {
            this.mes.setName(mes);
            this.mes.setNumber(numero);
            this.mes.setText(text);
        }

        public Mes getMes() {
            return this.mes;
        }
/*
        public int getNumero(){
            return this.numero;
        }

        public String getText(){
            return this.text;
        }*/
    }
}
