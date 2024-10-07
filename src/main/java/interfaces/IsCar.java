package interfaces;

import models.Car;

import java.util.List;

public interface IsCar {
    public void save(Car car);
    public Car getCar(Long id);
    public void update(Car car);
    public void delete(Car car);
    public List<Car> getCars();
}
