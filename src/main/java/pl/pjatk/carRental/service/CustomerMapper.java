package pl.pjatk.carRental.service;

import org.springframework.stereotype.Component;
import pl.pjatk.carRental.DTO.CustomerDTO;
import pl.pjatk.carRental.model.Customer;

@Component
public class CustomerMapper {

    public void mapDTOToCustomer(Customer customer, CustomerDTO customerDTO) {
        if (customerDTO.getName() != null) {
            customer.setName(customerDTO.getName());
        }
        if (customerDTO.getWallet() != null) {
            customer.setWallet(customerDTO.getWallet());
        }
        if (customerDTO.getCars() != null) {
            customer.setCars(customerDTO.getCars());
        }
    }
}
