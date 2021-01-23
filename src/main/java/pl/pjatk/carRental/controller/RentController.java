package pl.pjatk.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.model.Customer;
import pl.pjatk.carRental.service.RentService;

@RestController
public class RentController {

    private RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @PutMapping("/rent")
    public ResponseEntity<Customer> rentCar(@RequestParam Long customerID,@RequestParam Long carID,@RequestParam int days) {
        return  ResponseEntity.ok(rentService.rentCar(customerID, carID, days));
    }

    @PutMapping("/return")
    public ResponseEntity<Customer> returnCar(@RequestParam Long customerID,@RequestParam Long carID) {
        return ResponseEntity.ok(rentService.returnCar(customerID, carID));
    }

}