package com.lecture.carrental.service;

import com.lecture.carrental.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class ReservationService {

        // @Autowired --> @AllArgsConstructor kullanmak istemedigimizde kullanabiliriz... ama bu durumda final olmamali
        private final ReservationRepository reservationRepository;

}
