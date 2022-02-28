package com.lecture.carrental.dto;

import com.lecture.carrental.domain.Car;
import com.lecture.carrental.domain.FileDB;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {


    private Long id;


    private String model;



    private Integer doors;


    private Integer seats;


    private Integer luggage;


    private String transmission;


    private Boolean airConditioning;


    private Integer age;

    private Double pricePerHour;

    private String fuelType;

    private Boolean builtIn;


    private Set<String> image;

    //TODO Add constructor

    public CarDTO(Car car) {
        this.id = id;
        this.model = model;
        this.doors = doors;
        this.seats = seats;
        this.luggage = luggage;
        this.transmission = transmission;
        this.airConditioning = airConditioning;
        this.age = age;
        this.pricePerHour = pricePerHour;
        this.fuelType = fuelType;
        this.builtIn = builtIn;
        this.image = image;
    }

    public Set<String> getImageId(Set<FileDB> images){

        Set<String> img=new HashSet<>();

        FileDB[] fileDB=images.toArray(new FileDB[images.size()]);

        for (int i=0; i< image.size(); i++){
            img.add(fileDB[i].getId());

        }

        return img;

    }


}
