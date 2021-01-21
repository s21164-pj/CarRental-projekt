package pl.pjatk.carRental.DTO;

import org.springframework.stereotype.Component;
import pl.pjatk.carRental.model.Car;

import java.util.List;

@Component
public class CustomerDTO {
    private String name;
    private Double wallet;
    private List<Car> cars;

    public CustomerDTO() {
    }

    public CustomerDTO(String name, Double wallet, List<Car> cars) {
        this.name = name;
        this.wallet = wallet;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
