import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Automobile implements Comparable<Automobile>{

    private int id;
    private String maker;
    private String model;
    private Color color = Color.GRIS;
    private Engine engine;
    private FuelTank fuelTank;
    private TypeAutomobile type;
    private Wheel[] wheels;
    private int numberOfWheels = -1;
    private Person owner;

    private static String colorPatente = "Naranja";
    private static int ultimoId;
    public static final Integer ROUTE_MAX_SPEED = 200;
    public static final int CITY_MAX_SPEED = 60;

    public Automobile() {
        this.id = ++ultimoId;
        this.wheels = new Wheel[5];
    }

    public Automobile(String maker, String model) {
        this();
        this.maker = maker;
        this.model = model;
    }

    public Automobile(String maker, String model, Color color) {
        this(maker, model);
        this.color = color;
    }

    public Automobile(String maker, String model, Color color, Engine engine) {
        this(maker, model, color);
        this.engine = engine;
        this.fuelTank.setCapacity(40);
    }

    public Automobile(String maker, String model, Color color, Engine engine, FuelTank fuelTank) {
        this(maker, model, color);
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public Automobile(String maker, String model, Color color, Engine engine, FuelTank fuelTank, TypeAutomobile type, Wheel[] wheels, Person owner) {
        this(maker, model, color, engine, fuelTank);
        this.type = type;
        this.wheels = wheels;
        this.owner = owner;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automobile.colorPatente = colorPatente;
    }

    public TypeAutomobile getType() {
        return type;
    }

    public void setType(TypeAutomobile type) {
        this.type = type;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void addWheel(Wheel wheel){
        if(numberOfWheels < this.wheels.length) {
            this.wheels[++this.numberOfWheels] = wheel;
        }
    }

    public String detail(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID..............: ").append(this.id).append("\n");
        sb.append("Fabricante......: ").append(this.maker).append("\n");
        sb.append("Modelo..........: ").append(this.model).append("\n");
        sb.append("Color...........: ").append(this.color).append("\n");
        sb.append("Cilindrada......: ").append(this.engine).append("\n");
        sb.append("Color Patente...: ").append(Automobile.colorPatente).append("\n");
        sb.append("Tipo............: ").append(this.type).append("\n");

        if(this.engine != null){
            sb.append("Engine type.....: ").append(this.engine.getType()).append("\n");
            sb.append("Displacement....: ").append(this.engine.getDisplacement()).append("\n");
        }

        if(this.owner != null){
            sb.append("Owner Name......: ").append(this.owner.getName()).append("\n");
            sb.append("Owner Last Name.: ").append(this.owner.getLastName()).append("\n");
        }

        if(this.numberOfWheels > -1){
            sb.append("Wheels..........: \n");
            for(Wheel w: this.getWheels()){
                sb.append("     Brand: " + w.getBrand() + " Aro: " + w.getRing() + " Width: " + w.getWidth() +"\n");
            }
        }
        sb.append("=====================================================================" + "\n");
        return sb.toString();
    }

    public String speedUp(int rpm){
        return "el auto " + this.maker + " acelerando a " + rpm + " rpm";
    }

    public String brake(){
        return "el auto " + this.maker + " frenando!!!";
    }

    public String speedUpBrake(int rpm){
        return this.speedUp(rpm) + "\n" + this.brake();
    }

    public float calculateConsuption(int km, float percentage){
        return km / (this.fuelTank.getCapacity() * percentage);
    }

    public float calculateConsuption(int km, int percentage){
        return km / (this.fuelTank.getCapacity() * percentage / 100f);
    }

    @Override
    public String toString() {
        return "Automovile{" +
                "id='" + id + '\'' +
                ", fabricante='" + maker + '\'' +
                ", modelo='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + getEngine().toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return id == that.id && maker.equals(that.maker) && model.equals(that.model) && color == that.color && engine.equals(that.engine) && fuelTank.equals(that.fuelTank) && type == that.type && Arrays.equals(wheels, that.wheels) && owner.equals(that.owner);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, maker, model, color, engine, fuelTank, type, owner);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public int compareTo(Automobile a) {
        return this.maker.toUpperCase().compareTo(a.maker.toUpperCase());
    }
}
