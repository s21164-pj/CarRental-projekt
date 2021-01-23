package pl.pjatk.carRental.mapper;

import org.springframework.stereotype.Service;
import pl.pjatk.carRental.DTO.CustomerDTO;
import pl.pjatk.carRental.model.Customer;

@Service
public class CustomerMapper {
    public void mapDTOToCustomer(Customer customer, CustomerDTO customerDTO) {
        if (customerDTO.getName() != null) {
            customer.setName(customerDTO.getName());
        }
        if (customerDTO.getWallet() != null) {
            customer.setWallet(customerDTO.getWallet());
        }
        if (customerDTO.getOwnedCar() != null) {
            customer.setOwnedCar(customerDTO.getOwnedCar());
        }
    }
}
