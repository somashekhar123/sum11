package com.web.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Demo.Entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
