package pl.pjatk.carRental.service;

import org.springframework.stereotype.Component;
import pl.pjatk.carRental.DTO.CarDTO;
import pl.pjatk.carRental.model.Car;

@Component
public class CarMapper {

    public void mapDTOToCar(Car car, CarDTO carDTO) {
        if (carDTO.getMark() != null) {
            car.setMark(carDTO.getMark());
        }
        if (carDTO.getModel() != null) {
            car.setModel(carDTO.getModel());
        }
        if (carDTO.getColor() != null) {
            car.setColor(carDTO.getColor());
        }
        if (carDTO.getProductionYear() != null) {
            car.setProductionYear(carDTO.getProductionYear());
        }
        if (carDTO.getPricePerDay() != null) {
            car.setPricePerDay(carDTO.getPricePerDay());
        }
        if (carDTO.getNumberOfAvailable() != null) {
            car.setNumberOfAvailable(carDTO.getNumberOfAvailable());
        }
        if (carDTO.getCustomers() != null) {
            car.setCustomers(carDTO.getCustomers());
        }
    }
}
