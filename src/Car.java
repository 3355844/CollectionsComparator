import java.util.Objects;

public class Car {
    private  int number;
    private String model;
    private String carClass;


    public Car() {
    }


    public Car(int number, String model, String carClass) {
        this.number = number;
        this.model = model;
        this.carClass = carClass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return number == car.number &&
                Objects.equals(model, car.model) &&
                Objects.equals(carClass, car.carClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, carClass);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
}
