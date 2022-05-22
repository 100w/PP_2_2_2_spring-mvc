package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;


@Component
public class ServiceCars {
    private List<Car> listCars;

    public ServiceCars(List<Car> listCars) {
        this.listCars = listCars;

        Car car1 = new Car("Audi", "red", 1);
        Car car2 = new Car("BMW", "black", 7);
        Car car3 = new Car("BMW", "blue", 5);
        Car car4 = new Car("VAZ", "green", 99);
        Car car5 = new Car("Audi", "white", 2);

        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
    }

    public List<Car> countOfCars(int i) {
        if ((i > 0) && (i < 5)) return listCars.subList(0, i);
        else return listCars;
    }


}
