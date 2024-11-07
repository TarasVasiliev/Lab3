import java.util.Arrays;
import java.util.Comparator;

public class BoatMain {
    public static void main(String[] args) {
        Boats[] boats = {
                new Boats("Дослідник", 10.5, 6, 30.0, "Моторний"),
                new Boats("Моряк", 15.0, 8, 20.0, "Вітрильник"),
                new Boats("Швидкісний", 8.0, 4, 40.0, "Швидкісний"),
                new Boats("Вантажний", 20.0, 20, 15.0, "Вантажний"),
                new Boats("Круїзний", 12.0, 10, 25.0, "Круїзний")
        };

        Arrays.sort(boats, Comparator.comparingDouble(Boats::getLength)
                .thenComparing(Comparator.comparingInt(Boats::getCapacity).reversed()));

        System.out.println("Відсортовані човни:");
        for (Boats boat : boats) {
            System.out.println(boat);
        }

        Boats targetBoat = new Boats("Круїзний", 12.0, 10, 25.0, "Круїзний");

        boolean found = false;
        for (Boats boat : boats) {
            if (boat.equals(targetBoat)) {
                System.out.println("\nЗнайдено ідентичний човен: " + boat);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nІдентичний човен не знайдено.");
        }
    }
}
