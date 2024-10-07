package dao;

import interfaces.IsCar;
import jakarta.persistence.EntityManager;
import models.Car;

import java.util.List;

public class CarDAO implements IsCar {
    @Override
    public void save(Car car) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Car getCar(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Car.class, id);
    }

    @Override
    public void update(Car car) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(car);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Car car) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(car);
        em.getTransaction().commit();
    }

    @Override
    public List<Car> getCars() {
        return null;
    }
}
