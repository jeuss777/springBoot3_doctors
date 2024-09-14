/* package com.jarana.hospitalrestapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarana.hospitalrestapi.entity.PatientDoctor;
import com.jarana.hospitalrestapi.repository.PatientDoctorRepository;

@Service
public class PatientDoctorService {

    @Autowired
    private PatientDoctorRepository patientDoctorRepository;

    public List<PatientDoctor> getAllPatientDoctor() {
        return patientDoctorRepository.findAll();
    }

    public Optional<PatientDoctor> getPatientDoctorById(Long id) {
        return patientDoctorRepository.findById(id);
    }

    public PatientDoctor savePatientDoctor(PatientDoctor patientDoctor) {
        return patientDoctorRepository.save(patientDoctor);
    }

    public void deletePatientDoctor(Long id) {
        patientDoctorRepository.deleteById(id);
    }

}
 */