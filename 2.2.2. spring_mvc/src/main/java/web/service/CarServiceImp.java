package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCars(int count) {
        return carDao.listCars(count);
    }
}
