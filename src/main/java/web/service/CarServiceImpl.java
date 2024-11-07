package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 12000000));
        carList.add(new Car("AUDI", "A4", 8000000));
        carList.add(new Car("Wolkswagen", "Passat", 3000000));
        carList.add(new Car("УАЗ", "Патриот", 2000000));
        carList.add(new Car("Lada", "Granta", 2500000));
    }

    public List<Car> getCarListByCount(int carsCount) {
        if (carsCount > carList.size() || carsCount <= 0) {
            return carList;
        }
        return carList.subList(0, carsCount);
    }
}
