package pl.pjatk.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.carRental.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
