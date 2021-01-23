package pl.pjatk.carRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pjatk.carRental.DTO.CarDTO;
import pl.pjatk.carRental.mapper.CarMapper;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.repository.CarRepository;


import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    private CarMapper carMapper;

    @Autowired
    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Optional<Car> findByID(Long id) {
        return carRepository.findById(id);
    }


    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long carID, CarDTO carWithUpdate) {
        Car dbCar = carRepository.findById(carID).get();
        carMapper.mapDTOToCar(dbCar, carWithUpdate);
        return carRepository.save(dbCar);
    }

    public boolean deleteCar(Long id) {
        if (carRepository.findById(id).isPresent()) {
            if (carRepository.findById(id).get().getOwnerName() == null) {
                carRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }




    public void deleteAll() {
        carRepository.deleteAll();
    }



}







