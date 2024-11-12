import java.util.Objects;

/**
 * Клас Boats представляє морський човен з кількома характеристиками, такими як назва,
 * довжина, місткість, швидкість і тип.
 */
public class Boats {
    private String name;       // Назва човна
    private double length;     // Довжина човна в метрах
    private int capacity;      // Місткість човна (кількість людей)
    private double speed;      // Максимальна швидкість човна в км/год
    private String type;       // Тип човна (наприклад, моторний, круїзний)

    /**
     * Конструктор класу Boats для ініціалізації об'єкта човна з заданими параметрами.
     *
     * @param name назва човна
     * @param length довжина човна в метрах
     * @param capacity місткість човна (кількість людей)
     * @param speed максимальна швидкість човна в км/год
     * @param type тип човна
     */
    public Boats(String name, double length, int capacity, double speed, String type) {
        this.name = name;
        this.length = length;
        this.capacity = capacity;
        this.speed = speed;
        this.type = type;
    }

    /**
     * Повертає назву човна.
     *
     * @return назва човна
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає довжину човна.
     *
     * @return довжина човна в метрах
     */
    public double getLength() {
        return length;
    }

    /**
     * Повертає місткість човна.
     *
     * @return місткість човна (кількість людей)
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Повертає максимальну швидкість човна.
     *
     * @return швидкість човна в км/год
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Повертає тип човна.
     *
     * @return тип човна (наприклад, моторний, круїзний)
     */
    public String getType() {
        return type;
    }

    /**
     * Перевизначений метод equals для порівняння об'єктів Boats.
     * Два човни вважаються рівними, якщо їх назва, довжина, місткість, швидкість і тип збігаються.
     *
     * @param o об'єкт для порівняння
     * @return true, якщо об'єкти рівні, інакше false
     */
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

    /**
     * Перевизначений метод hashCode для забезпечення сумісності з методом equals.
     *
     * @return хеш-код для об'єкта Boats
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, length, capacity, speed, type);
    }

    /**
     * Перевизначений метод toString для виведення інформації про об'єкт Boats.
     *
     * @return рядок з детальною інформацією про човен
     */
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
