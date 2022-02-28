package com.lecture.carrental.repository;

import com.lecture.carrental.domain.Car;
import com.lecture.carrental.dto.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT new com.lecture.carrental.dto.CarDTO(c) FROM Car c") //burada new denilerek direkt CarDTO ya baglanmis olduk
    List<CarDTO>  findAllCar();

}
