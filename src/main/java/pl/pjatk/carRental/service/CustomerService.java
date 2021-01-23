package pl.pjatk.carRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pjatk.carRental.DTO.CustomerDTO;
import pl.pjatk.carRental.mapper.CustomerMapper;
import pl.pjatk.carRental.model.Customer;
import pl.pjatk.carRental.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
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

    public Customer updateCustomer(Long id, CustomerDTO customerWithUpdate) {
        Customer dbCustomer = customerRepository.findById(id).get();
        customerMapper.mapDTOToCustomer(dbCustomer, customerWithUpdate);
        return customerRepository.save(dbCustomer);
    }

    public boolean deleteCustomer(Long id) {
        if (customerRepository.findById(id).isPresent()) {
            if (customerRepository.findById(id).get().getOwnedCar() == null) {
                customerRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }

    public Customer depositMoney(Long customerID, double deposit) {
        Customer customer = customerRepository.findById(customerID).get();
        customer.setWallet(customer.getWallet() + deposit);
        return customerRepository.save(customer);
    }



}