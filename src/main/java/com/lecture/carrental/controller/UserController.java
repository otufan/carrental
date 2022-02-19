package com.lecture.carrental.controller;

import com.lecture.carrental.domain.User;
import com.lecture.carrental.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@RestController
@Produces(MediaType.APPLICATION_JSON)//response lar json formnatinda gelsin diye. postman da gelen type cesidi
@RequestMapping() //get ve post mapping kullanabilmek icin
@AllArgsConstructor //Auto wired yazmamak icin
public class UserController {


    public UserService userService;



    @PostMapping("/register")
    public ResponseEntity<Map<String, Boolean>> registerUser(@Valid @RequestBody User user){ //@Valid ile entity class da obje uzerine yazdigimiz kisitlamalarin aciklamalarini getiriyoruz
                                                                                            //@Size ve @NotNull gibi anatasyonlarin mesajlari yani
        userService.register(user);
        Map<String, Boolean> map=new HashMap<>();
        map.put("User registered successfully!", true);

        return new ResponseEntity<>(map, HttpStatus.CREATED);//Response 201 olarak bu sekilde dondurmus olduk


    }




}
