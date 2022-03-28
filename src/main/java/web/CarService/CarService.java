package web.CarService;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Hammer", "x1", 2021));
        cars.add(new Car("Jeep", "x2", 2022));
        cars.add(new Car("Camry", "x3", 1968));
        cars.add(new Car("Impala","x4", 1960));
        cars.add(new Car("KiaRio", "x5", 2019));
    }
    public List<Car> intCar(int count){
        if(count >= 5 || count <= 0){
            return cars;
        }else{
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
