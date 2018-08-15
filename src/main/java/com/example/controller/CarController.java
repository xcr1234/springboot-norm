package com.example.controller;

import com.example.dao.CarDao;
import com.example.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarDao carDao;

    @RequestMapping("/cars")
    public List<Car> cars() throws Exception {
        List<Car> list = carDao.findAll();
        System.out.println(list);
        return list;
    }

}
