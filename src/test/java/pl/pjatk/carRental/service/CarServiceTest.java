package pl.pjatk.carRental.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.repository.CarRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    @Mock
    private CarRepository carRepository;
    @InjectMocks
    private CarService carService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        //Given
        when(carRepository.findAll()).thenReturn(List.of(new Car()));
        //When
        List<Car> all = carService.findAll();
        //Then
        assertThat(all).hasSize(1);
    }

    @Test
    void findByID() {
        //Given
        when(carService.findByID(1L)).thenReturn(Optional.of(new Car(1L,"Ford", "Panda", "red", 2000, 200, true, "Karol")));
        //When
        Optional<Car> player = carService.findByID(1L);
        //Then
        assertThat(player).isNotNull();
    }

    @Test
    void addCar() {

    }

    @Test
    void updateCar() {

    }

    @Test
    void deleteCar() {

    }

    @Test
    void deleteAll() {


    }
}