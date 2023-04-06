import java.util.Objects;

public class Engine {
    private double displacement;
    private EngineType type;

    public Engine() {
    }

    public Engine(double displacement) {
        this.displacement = displacement;
    }

    public Engine(double displacement, EngineType type) {
        this.displacement = displacement;
        this.type = type;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "displacement=" + displacement +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.displacement, displacement) == 0 && type == engine.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(displacement, type);
    }
}
