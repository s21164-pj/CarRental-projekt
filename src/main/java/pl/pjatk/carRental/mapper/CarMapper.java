package pl.pjatk.carRental.mapper;

import org.springframework.stereotype.Service;
import pl.pjatk.carRental.DTO.CarDTO;
import pl.pjatk.carRental.model.Car;

@Service
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
        if (carDTO.getOwnerName() != null) {
            car.setOwnerName(carDTO.getOwnerName());
            car.setAvailable(false);
        }else {
            car.setAvailable(true);
        }
    }
}

