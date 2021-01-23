package pl.pjatk.carRental.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private String color;
    private int productionYear;
    private double pricePerDay;
    private boolean isAvailable = true;
    private String ownerName;

    public Car() {
    }

    public Car(String mark, String model, String color, int productionYear, double pricePerDay) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
    }

    public Car(String mark, String model, String color, int productionYear, double pricePerDay, boolean isAvailable) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public Car(Long id, String mark, String model, String color, int productionYear, double pricePerDay, boolean isAvailable, String ownerName) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
        this.ownerName = ownerName;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

