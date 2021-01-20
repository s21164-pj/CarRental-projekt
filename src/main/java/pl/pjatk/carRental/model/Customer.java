package pl.pjatk.carRental.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double wallet;

    @ManyToMany(mappedBy = "customers")
    private List<Car> cars;

    public Customer() {
    }

    public Customer(String name, Long wallet) {

        this.name = name;
        this.wallet = wallet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}