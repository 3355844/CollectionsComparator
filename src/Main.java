import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(23456, "Toyota", "E"));
        cars.add(new Car(6543, "Vaz", "C"));
        cars.add(new Car(6546543, "Laz", "D"));
        cars.add(new Car(6987, "DAF", "DE"));
        cars.add(new Car(434121, "Audi", "S6"));

        Collections.sort(cars, new SorterByNumber());
        System.out.println(cars);

        Collections.sort(cars, new SorterByModel());
        System.out.println(cars);
    }
}
