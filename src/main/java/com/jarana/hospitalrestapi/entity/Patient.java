package com.jarana.hospitalrestapi.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name= "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zipCode;

  

  /*   //@JsonManagedReference
    @OneToMany(mappedBy = "patient")    
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    private List<MedicalRecord> medicalRecords; */
    
    //@JsonBackReference
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)       
    private Doctor doctor;

    // @ManyToMany
    // @JoinTable(
    //     name = "PatientDoctor",
    //     joinColumns = @JoinColumn(name = "patient_id"),
    //     inverseJoinColumns = @JoinColumn(name = "doctor_id")
    // )
}
