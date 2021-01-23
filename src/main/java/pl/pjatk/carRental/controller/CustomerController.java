package pl.pjatk.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.carRental.DTO.CustomerDTO;
import pl.pjatk.carRental.model.Customer;
import pl.pjatk.carRental.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping
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

    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestParam Long id, @RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.updateCustomer(id, customerDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCustomer(@RequestParam long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/deposit")
    public ResponseEntity<Customer> depositMoney(@RequestParam Long id, @RequestParam double deposit) {
        return ResponseEntity.ok(customerService.depositMoney(id, deposit));
    }

}