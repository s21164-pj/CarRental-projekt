package pl.pjatk.carRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pjatk.carRental.model.Car;
import pl.pjatk.carRental.model.Customer;

@Service
public class RentService {

    private CarService carService;
    private CustomerService customerService;

    @Autowired
    public RentService(CarService carService, CustomerService customerService) {
        this.carService = carService;
        this.customerService = customerService;
    }

    public Customer rentCar(Long customerID, Long carID, int days) {
        Customer buyer = customerService.findByID(customerID).get();
        Car car = carService.findByID(carID).get();

        if (canRent(buyer, car, days)) {
            payment(buyer, car, days);
            takeCar(buyer, car);

            carService.addCar(car);
            return customerService.addCustomer(buyer);
        } else {
            return buyer;
        }
    }


    public boolean canRent(Customer customer, Car car, int days) {
        if (customer.getWallet() > car.getPricePerDay() * days && car.isAvailable() && car.getOwnerName() == null && customer.getOwnedCar() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void payment(Customer customer, Car car, int days) {
        customer.setWallet(customer.getWallet() - car.getPricePerDay() * days);
    }

    public void takeCar(Customer customer, Car car) {
        customer.setOwnedCar("ID:" + car.getId() + " " + car.getMark() + " " + car.getModel());
        car.setOwnerName("ID" + " " + customer.getName());
        car.setAvailable(false);
    }

    public Customer returnCar(Long customerID, Long carID) {
        Customer customer = customerService.findByID(customerID).get();
        Car car = carService.findByID(carID).get();
        if (customer.getOwnedCar() != null && car.getOwnerName() != null) {
            customer.setOwnedCar(null);
            car.setOwnerName(null);
            car.setAvailable(true);
            carService.addCar(car);
            return customerService.addCustomer(customer);
        } else {
            return customer;
        }

    }




  /*@EventListener(ApplicationReadyEvent.class)
    public void fillDB() {

        customerService.addCustomer(new Customer("Daniel", 600.50));
        customerService.addCustomer(new Customer("Marek", 300));
        customerService.addCustomer(new Customer("Karol", 0));
        carService.addCar(new Car("Ford", "Panda", "red", 2000, 200));
        carService.addCar(new Car("BMW", "e36", "black", 1991, 50));
        carService.addCar(new Car("Audi", "A6", "silver", 2010, 1000));


    }*/
}
