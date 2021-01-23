package pl.pjatk.carRental.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.pjatk.carRental.repository.CarRepository;

@ExtendWith(MockitoExtension.class)
class RentServiceTest {


    @Mock
    private CarService carService;
    private CarRepository carRepository;
    @InjectMocks
    private RentService rentService;


    @Test
    void rentCar() {

    }

    @Test
    void canRent() {
    }

    @Test
    void payment() {
    }

    @Test
    void takeCar() {
    }

    @Test
    void returnCar() {
    }
}