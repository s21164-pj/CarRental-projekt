package pl.pjatk.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.carRental.DTO.CarDTO;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.service.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping
    public ResponseEntity<Car> findByID(@RequestParam Long id) {
        Optional<Car> byId = carService.findByID(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok(byId.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public  ResponseEntity<Car> updateCar(@RequestParam Long id, @RequestBody CarDTO carDTO) {
        return ResponseEntity.ok(carService.updateCar(id, carDTO));
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(carService.addCar(car));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCar(@RequestParam long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }



}