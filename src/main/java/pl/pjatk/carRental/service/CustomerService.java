package pl.pjatk.carRental.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.pjatk.carRental.model.Customer;
import pl.pjatk.carRental.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findByID(Long id) {
        return customerRepository.findById(id);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void updateCustomer() {

    }

    public boolean deleteCustomer(Long id) {
        if (customerRepository.findById(id).get().getCars().isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {

    }

}
