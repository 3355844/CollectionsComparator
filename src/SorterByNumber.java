import java.util.Comparator;

public class SorterByNumber implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return   o1.getNumber() - o2.getNumber();
    }
}
