package com.jarana.hospitalrestapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String contactNumber;
    private String email;
    private String officeAddress;


   /*  //@JsonManagedReference
    @JsonIgnoreProperties
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    @JsonIgnoreProperties
    @OneToMany(mappedBy = "doctor")
    private List<MedicalRecord> medicalRecords; */

    //@JsonManagedReference    
    //@JsonIgnoreProperties("doctor")
    //@JsonBackReference
    
    @OneToMany(targetEntity = Patient.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)    
    @JoinColumn(name = "patient_id")
    private List<Patient> patients;
    // Getters and Setters

}
