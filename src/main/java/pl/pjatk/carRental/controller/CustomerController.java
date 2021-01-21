package pl.pjatk.carRental.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.model.Customer;
import pl.pjatk.carRental.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping("/id")
    public ResponseEntity<Customer> findByID(@RequestParam Long id) {
        Optional<Customer> byId = customerService.findByID(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok(byId.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCustomer(@RequestParam long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

}
