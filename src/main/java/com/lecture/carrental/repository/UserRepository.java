package com.lecture.carrental.repository;


import com.lecture.carrental.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    // @Query("SELECT u FROM User u WHERE u.email=?1") --> Default olarak olusturuluyor
    Optional<User> findByEmail(String email);

}
