package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cars")
@Getter
@Setter
@ToString
public class Car {
    @Id
    private Long id;
    private String make;
    private String model;
    private int year;
    private double price;
}
