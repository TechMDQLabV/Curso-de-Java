public enum TypeAutomobile {
    SEDAN("Sedan", "Auto Normal", 4),
    STATION_WAGON("Station Wagon", "Auto Grande", 4),
    HATCHBACK("Hatchback", "Auto Compacto", 4),
    PICKUP("Pickup", "Camioneta", 2),
    COUPE("Coupe", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto Deportivo", 2),
    FURGON("Furgon", "Auto Utilitario", 3);

    private final String nombre;
    private final String desctiption;
    private final int nroPuertas;

    TypeAutomobile(String nombre, String desctiption, int nroPuertas) {
        this.nombre = nombre;
        this.nroPuertas = nroPuertas;
        this.desctiption = desctiption;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public String getDesctiption() {
        return desctiption;
    }

    @Override
    public String toString() {
        return nombre + ' ' + desctiption + ' ' + nroPuertas + '\'';
    }
}
