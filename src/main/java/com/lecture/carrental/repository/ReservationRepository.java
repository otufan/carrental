package com.lecture.carrental.repository;


import com.lecture.carrental.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {



}
