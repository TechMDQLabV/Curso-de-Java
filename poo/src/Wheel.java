import java.util.Objects;

public class Wheel {
    private String brand;
    private int ring;
    private double width;

    public Wheel() {
    }

    public Wheel(String brand, int ring, double width) {
        this.brand = brand;
        this.ring = ring;
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRing() {
        return ring;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", ring=" + ring +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return ring == wheel.ring && Double.compare(wheel.width, width) == 0 && brand.equals(wheel.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ring, width);
    }
}
