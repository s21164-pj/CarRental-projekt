package pl.pjatk.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.carRental.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
