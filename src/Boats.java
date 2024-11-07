import java.util.Objects;

/**
 * Клас Boat представляє морський човен з кількома характеристиками.
 */
public class Boats {
    private String name;
    private double length;
    private int capacity;
    private double speed;
    private String type;

    public Boats(String name, double length, int capacity, double speed, String type) {
        this.name = name;
        this.length = length;
        this.capacity = capacity;
        this.speed = speed;
        this.type = type;
    }

    public String getName() { return name; }
    public double getLength() { return length; }
    public int getCapacity() { return capacity; }
    public double getSpeed() { return speed; }
    public String getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boats boat = (Boats) o;
        return Double.compare(boat.length, length) == 0 &&
                capacity == boat.capacity &&
                Double.compare(boat.speed, speed) == 0 &&
                Objects.equals(name, boat.name) &&
                Objects.equals(type, boat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, capacity, speed, type);
    }

    @Override
    public String toString() {
        return "Човен{" +
                "назва='" + name + '\'' +
                ", довжина=" + length +
                ", вантажопідйомність=" + capacity +
                ", швидкість=" + speed +
                ", тип='" + type + '\'' +
                '}';
    }
}
