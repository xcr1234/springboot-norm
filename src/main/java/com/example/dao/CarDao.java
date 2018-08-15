package com.example.dao;

import com.example.entity.Car;
import norm.CrudDao;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends CrudDao<Car,Integer> {
}
