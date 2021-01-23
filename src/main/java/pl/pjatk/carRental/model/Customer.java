package pl.pjatk.carRental.model;

import javax.persistence.*;


@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double wallet;
    private String ownedCar;

    public Customer() {
    }

    public Customer(String name, double wallet) {
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

    public String getOwnedCar() {
        return ownedCar;
    }

    public void setOwnedCar(String ownedCar) {
        this.ownedCar = ownedCar;
    }
}