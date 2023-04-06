import java.util.Objects;

public class FuelTank {
    private int capacity;

    public FuelTank() {
        this.capacity = 40;
    }

    public FuelTank(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelTank fuelTank = (FuelTank) o;
        return capacity == fuelTank.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }
}
