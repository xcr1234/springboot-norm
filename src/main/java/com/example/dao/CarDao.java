package com.example.dao;

import com.example.entity.Car;
import norm.CrudDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends CrudDao<Car,Integer> {


    List<Car> findByName(@Param("name") String name);

}
