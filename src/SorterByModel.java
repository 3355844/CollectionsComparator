import java.util.Comparator;

public class SorterByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getModel().compareTo(o1.getModel());
    }
}
