import dao.CarDAO;
import models.Car;

public class Main {
    public static void main(String[] args) {
        CarDAO daoCar = new CarDAO();
        Car car = new Car();
        car.setId(1L);
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2021);
        car.setPrice(20000.00);
        daoCar.save(car);
    }
}
