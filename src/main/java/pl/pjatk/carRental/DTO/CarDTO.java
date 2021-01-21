package pl.pjatk.carRental.DTO;

import org.springframework.stereotype.Component;
import pl.pjatk.carRental.model.Customer;

import java.util.List;

@Component
public class CarDTO {
    private String mark;
    private String model;
    private String color;
    private Integer productionYear;
    private Double pricePerDay;
    private Integer numberOfAvailable;
    private List<Customer> customers;

    public CarDTO() {
    }

    public CarDTO(String mark, String model, String color, Integer productionYear, Double pricePerDay, Integer numberOfAvailable, List<Customer> customers) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.numberOfAvailable = numberOfAvailable;
        this.customers = customers;
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

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Integer getNumberOfAvailable() {
        return numberOfAvailable;
    }

    public void setNumberOfAvailable(Integer numberOfAvailable) {
        this.numberOfAvailable = numberOfAvailable;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
