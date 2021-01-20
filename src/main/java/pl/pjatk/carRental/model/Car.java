package pl.pjatk.carRental.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String mark;
    private String model;
    private String color;
    private int productionYear;
    private double pricePerDay;
    private int numberOfAvailable;
    private boolean isAvailable;

    @ManyToMany
    private List<Customer> customers;

    public Car() {
    }

    public Car(String mark, String model, String color, int productionYear, double pricePerDay, int numberOfAvailable) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.numberOfAvailable = numberOfAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getNumberOfAvailable() {
        return numberOfAvailable;
    }

    public void setNumberOfAvailable(int numberOfAvailable) {
        this.numberOfAvailable = numberOfAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}