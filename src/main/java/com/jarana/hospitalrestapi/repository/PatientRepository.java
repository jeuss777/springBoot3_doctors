package com.jarana.hospitalrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.jarana.hospitalrestapi.entity.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {

}
