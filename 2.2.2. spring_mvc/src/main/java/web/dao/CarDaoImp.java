package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private static final List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("Mercedes","GLS","Black"));
        carsList.add(new Car("BMW","X7", "White"));
        carsList.add(new Car("AUDI","A5","Red"));
        carsList.add(new Car("VAZ","2107","Green"));
        carsList.add(new Car("KIA","Rio","Yellow"));
    }

    @Override
    public List<Car> listCars(int count) {
        if(count == 0 || count>5) {
        return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
