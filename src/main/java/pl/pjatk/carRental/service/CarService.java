package pl.pjatk.carRental.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.repository.CarRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Optional<Car> findByID(Long id) {
        return carRepository.findById(id);
    }


    public Car addCar(Car car) {
        return  carRepository.save(car);
    }

    public void updateCar() {

    }

    public boolean deleteCar(Long id) {

        if (carRepository.findById(id).get().getCustomers().isEmpty()) {
            carRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public void deleteAll() {
        carRepository.deleteAll();
    }




    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        addCar(new Car("Ford", "Panda", "red", 2000, 250.0, 3));
    }
}

